public class Pizza
{
	private String nombre;
	private double costoDeProduccion;
	private int cantidadProducida;
	private double precioDeVenta;


	
	public Pizza (String nNombre , double nCosto,int nCantiadadProducida, double nPrecio )
    {
        nombre =nNombre;
        costoDeProduccion = nCosto;
        cantidadProducida =nCantiadadProducida;
        precioDeVenta = nPrecio;

    }

    public double darGananciaUnitaria()
    {   
        return precioDeVenta- costoDeProduccion;

    }
    public double darGananciaTotal()
    {
        double resta = darGananciaUnitaria();
        return resta*cantidadProducida;
    }

}

