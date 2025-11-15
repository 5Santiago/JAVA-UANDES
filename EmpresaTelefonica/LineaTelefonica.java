public class LineaTelefonica
{   
    private double costoLlamadas;
    private int numeroLlamadas;
    private int numeroMinutos;
    public void inicializar()
    { 
        costoLlamadas = 0.0;
        numeroLlamadas = 0;
        numeroMinutos = 0;


    }
    public void reiniciar()
    {
        costoLlamadas = 0.0;
        numeroLlamadas = 0;
        numeroMinutos = 0;
    }
    public double darCostollamadas()
    {
        return costoLlamadas;
    }
    public int darNumeroLlamadas()
    {
        return numeroLlamadas;
    }
    public int darNumeroMinutos()
    {
        return numeroMinutos;
    }
    public void agregarLlamadaLargaDistancia(int minutos)
    {
        numeroLlamadas ++;
        numeroMinutos = numeroMinutos+minutos;
        costoLlamadas = costoLlamadas + minutos*380;
    }
    public void agregarLlamadaLocal(int minutos)
    {
        numeroLlamadas++;
        numeroMinutos = numeroMinutos+minutos;
        costoLlamadas = costoLlamadas + minutos*35;
    }
    public void agregarLlamadaCelular(int minutos)
    {
        numeroLlamadas++;
        numeroMinutos = numeroMinutos+minutos;
        costoLlamadas = costoLlamadas + minutos*999;
    }
}