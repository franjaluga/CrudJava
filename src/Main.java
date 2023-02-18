import com.franjaluga.simplecrud.models.Data;

public class Main {
    public static void main(String[] args) {

        Data miData = new Data();

        System.out.println("=== Se van a crear 3 elementos ===");
        System.out.println("Name 1 -> índice [0]");
        System.out.println("Name 2 -> índice [1]");
        System.out.println("Name 3 -> índice [2]");

        miData.addData("Name 1");
        miData.addData("Name 2");
        miData.addData("Name 3");

        System.out.println("=== Se va a obtener el índice [0] ===");
        System.out.println( miData.getPorId( 0 ) );

        System.out.println("=== Se va a eliminar el índice [0] ===");
        miData.deleteDataById( 0 );

        System.out.println("=== Se va a obtener el nuevo dato que está en el índice [0] ===");
        System.out.println(  miData.getPorId( 0 ) );

        System.out.println("=== Se va a reemplazar el índice [0] con el literal 'Name 4' ===");

        miData.updateById( 0 , "Name 4");

        System.out.println("=== Se va a obtener el nuevo dato que está en el índice [0] ===");
        System.out.println(  miData.getPorId( 0 ) );

    }
}