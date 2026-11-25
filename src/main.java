public class main {
    public static void main(String[] args) {
        SistemaGestion sistema = new SistemaGestion();
        String datos = "Ventas del mes: 150";
        sistema.generar(new ReportePDF(), datos);
        sistema.generar(new ReporteExcel(), datos);
        sistema.generar(new ReporteHTML(), datos);
    }
}
