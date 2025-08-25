package banco;

import java.util.Objects;
import java.util.regex.Pattern;

public class Cliente {
    private final String dni;
    private final String nombre;
    private final String email;

    public Cliente(String dni, String nombre, String email) {
        if (!Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$").matcher(email).matches())
            throw new IllegalArgumentException("Email inválido");
        this.dni = Objects.requireNonNull(dni);
        this.nombre = Objects.requireNonNull(nombre);
        this.email = email;
    }
    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
}
