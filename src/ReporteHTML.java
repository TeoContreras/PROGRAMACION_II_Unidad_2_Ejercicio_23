public class ReporteHTML implements GeneradorReporte {
    public void exportar(String contenido) { System.out.println("<html><body>" + contenido + "</body></html>"); }
}
