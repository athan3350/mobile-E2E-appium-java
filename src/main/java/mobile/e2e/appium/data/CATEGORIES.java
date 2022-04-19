package mobile.e2e.appium.data;

public enum CATEGORIES {

    COMIDA("Comida"),
    AUTOMOVIL("Automóvil"),
    TRANSPORTE("Transporte"),
    COMPRAS("Compras"),
    ENTRETENIMIENTO("Entretenimiento"),
    CUIDADO_DE_LA_SALUD("Cuidado de la salud"),
    SEGURO("Seguro"),
    PRESTAMOS("Préstamos"),
    VIAJE("Viaje"),
    FACTURAS_Y_TARIFAS("Facturas y tarifas"),
    CASA("Casa"),
    PERSONAL("Personal"),
    FAMILIA("Familia"),
    EDUCACION("Educación"),
    REGALOS("Regalos"),
    COMESTIBLES("Comestibles"),
    APTITUD_FISICA("Aptitud física"),
    MUEBLES("Muebles"),
    SALARIO("Salario"),
    INVERSION("Inversión"),
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
