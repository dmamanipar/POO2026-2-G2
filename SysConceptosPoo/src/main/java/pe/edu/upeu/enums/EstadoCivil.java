package pe.edu.upeu.enums;

import lombok.Getter;
@Getter
public enum EstadoCivil {
    SOLTERO("Soltero"),
    CASADO("Casado"),
    VIUDO("Viudo"),
    DIVORCIADO("Divorciado");
    String descripcion;
    EstadoCivil(String descripcion) {
        this.descripcion = descripcion;
    }
}
