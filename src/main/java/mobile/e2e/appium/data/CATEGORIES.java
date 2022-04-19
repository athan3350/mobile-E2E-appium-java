package mobile.e2e.appium.data;

public enum CATEGORIES {

    COMIDA("Comida"),
    AUTOMOVIL("Autom�vil"),
    TRANSPORTE("Transporte"),
    COMPRAS("Compras"),
    ENTRETENIMIENTO("Entretenimiento"),
    CUIDADO_DE_LA_SALUD("Cuidado de la salud"),
    SEGURO("Seguro"),
    PRESTAMOS("Pr�stamos"),
    VIAJE("Viaje"),
    FACTURAS_Y_TARIFAS("Facturas y tarifas"),
    CASA("Casa"),
    PERSONAL("Personal"),
    FAMILIA("Familia"),
    EDUCACION("Educaci�n"),
    REGALOS("Regalos"),
    COMESTIBLES("Comestibles"),
    APTITUD_FISICA("Aptitud f�sica"),
    MUEBLES("Muebles"),
    SALARIO("Salario"),
    INVERSION("Inversi�n"),
    ACCIONES("Acciones"),
    HERENCIA("Herencia"),
    PRIMO("Primo"),
    TRABAJO_A_TIEMPO_PARCIAL("Trabajo a tiempo parcial"),
    OTORGAR("Otorgar"),
    OTROS("Otros");

    private final String category;

    CATEGORIES(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

}
