import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        File dir = new File("game");
            if (dir.mkdir()){
                System.out.println("папка game создана");
                File dir1 = new File("game//src");
                    if (dir1.mkdir()){
                        System.out.println("+ папка src создана");
                        File dir12 = new File("game//src//main");
                        if (dir12.mkdir()){
                            System.out.println("+ + папка main создана");
                            File dir121 = new File("game//src//main//Main.java");
                            if (dir121.createNewFile()){
                                System.out.println("+ + + Файл Main создан");
                            }
                            File dir122 = new File("game//src//main//Utils.java");
                            if (dir122.createNewFile()){
                                System.out.println("+ + + Файл Utils создан");
                            }
                        }
                        File dir13 = new File("game//src//test");
                        if (dir13.mkdir()){
                            System.out.println("+ + папка test создана");
                        }
                    }
                File dir2 = new File("game//savegame");
                    if (dir2.mkdir()){
                        System.out.println("+ папка savegame создана");
                    }
                File dir3 = new File("game//res");
                    if (dir3.mkdir()){
                        System.out.println("+ папка res создана");
                        File dir31 = new File("game//res//drawables");
                            if (dir31.mkdir()){
                                System.out.println("+ + папка drawables создана");
                            }
                        File dir32 = new File("game//res//vectors");
                            if (dir32.mkdir()){
                                System.out.println("+ + папка vectors создана");
                        }
                        File dir33 = new File("game//res//icons");
                            if (dir33.mkdir()){
                                System.out.println("+ + папка icons создана");
                        }
                    }
                File dir4 = new File("game//temp");
                    if (dir4.mkdir()){
                        System.out.println("+ папка temp создана");
                        File dir41 = new File("game//temp//temp.txt");
                            if (dir41.createNewFile())
                                System.out.println("+ + Файл temp создан");

                    }
            }
        try(FileWriter writer = new FileWriter("game//temp//temp.txt", false))
        {
            String text = "cоздано: " +
                    "(папка game), " +
                    "(папка src), " +
                    "(папка main), " +
                    "(Файл Utils), " +
                    "(папка test), " +
                    "(папка savegame), " +
                    "(папка res), " +
                    "(папка drawables), " +
                    "(папка vectors), " +
                    "(папка icons), " +
                    "(папка temp), " +
                    "(Файл temp), " +
                    "(Файл Main)";
            writer.write(text);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
