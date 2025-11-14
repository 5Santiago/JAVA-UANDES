public class Empresa
{
    private String Nombre;
    public LineaTelefonica linea1;
    public LineaTelefonica linea2;
    public LineaTelefonica linea3;
    public LineaTelefonica darLinea1()
    {
        return linea1;
    }
    public LineaTelefonica darLinea2()
    {
        return linea2;
    }
    public LineaTelefonica darLinea3()
    {
        return linea3;
    }
    public void agregarLlamadaLocalLinea1(int minutos)
    {
        linea1.agregarLlamadaLocal(minutos);
    }
    public void agregarLlamadaLocalLinea2(int minutos)
    {
        linea2.agregarLlamadaLocal(minutos);
    }
    public void agregarLlamadaLocalLinea3(int minutos)
    {
        linea3.agregarLlamadaLocal(minutos);
    }
    public void agregarLlamadaLargaDistanciaLinea1(int minutos)
    {
        linea1.agregarLlamadaLargaDistancia(minutos);
    }
    public void agregarLlamadaLargaDistanciaLinea2(int minutos)
    {
        linea2.agregarLlamadaLargaDistancia(minutos);
    }
    public void agregarLlamadaLargaDistanciaLinea3(int minutos)
    {
        linea3.agregarLlamadaLargaDistancia(minutos);
    }
    public double darCostollamadas()
    {
        return linea1.darCostollamadas()+linea2.darCostollamadas()+linea3.darCostollamadas();
    }
    public int darTotalMinutos()
    {
        return linea1.darNumeroMinutos()+linea2.darNumeroMinutos()+linea3.darNumeroMinutos();
    }
    public double darCostoPromedioMinuto()
    {
        return darCostollamadas()/darTotalMinutos();
    }
    public void inicializar()
    {
        linea1 = new LineaTelefonica();
        linea1.inicializar();
        linea2 = new LineaTelefonica();
        linea2.inicializar();
        linea3 = new LineaTelefonica();
        linea3.inicializar();
    }
    
}