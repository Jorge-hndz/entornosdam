import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la cantidad de usuarios que quieres crear: ");
        int cantidad = teclado.nextInt();

        Usuario[] usuarios = crearUsuarios(cantidad);
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.nombre + " " + usuario.apellidos + " - " + usuario.email);
        }
        teclado.close();
    }
    public static Usuario[] crearUsuarios(int cantidad) {
        Scanner teclado = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[cantidad];
        for (int i = 0; i < cantidad; i++) {
            usuarios[i] = new Usuario();
            System.out.print("Nombre: ");
            usuarios[i].nombre = teclado.nextLine();
            System.out.print("Apellidos: ");
            usuarios[i].apellidos = teclado.nextLine();
            System.out.print("Email: ");
            usuarios[i].email = teclado.nextLine();
        }
        teclado.close();
        return usuarios;
    }
}