import java.util.*;

public class UserIface{
    Scanner kScanner = new Scanner(System.in);
    HashMap<String, ArrayList<String>> conversations = new HashMap<String, ArrayList<String>>();
    protected ArrayList<String> pedidosDeAmizades = new ArrayList<String>();//contem 'logins' de users que querem ser amigos
    protected ArrayList<UserIface> friends = new ArrayList<UserIface>();
    protected ArrayList<String> myFeed = new ArrayList<String>();
    protected ArrayList<String> myCommunitys = new ArrayList<String>();//nomes das communitys as quais ele participa
    private String name, login, pass;
    protected HashMap<String, UserData<Long>> dataLongInt = new HashMap<String, UserData<Long>>();
    protected HashMap<String, UserData<String>> dataStr = new HashMap<String, UserData<String>>();

    
    public UserIface(String nome, String login, String senha) {
        setName(nome);
        setLogin(login);
        setPass(senha);
    }

    public void status() {
        System.out.println("\n\n========STATUS========");
        System.out.println("Nome: " + getName());
        System.out.println("Login: " + getLogin());
        System.out.println("Senha: " + getPass());
        for (Map.Entry<String, UserData<Long>> entrada : dataLongInt.entrySet())
            System.out.println(entrada.getKey() + ": " + entrada.getValue().getValue());
        for (Map.Entry<String, UserData<String>> entrada : dataStr.entrySet())
            System.out.println(entrada.getKey() + ": " + entrada.getValue().getValue());
        System.out.println("======================");
    }

    public void listarAmigos() {
        System.out.println("\n\n========LISTA DE AMIGOS========");
        for (UserIface uFriends: this.friends)
            System.out.println(uFriends.getLogin());
        System.out.println("===============================\n");
    }

    public String getName() {
        return this.name;
    }
    public String getPass() {
        return this.pass;
    }
    public String getLogin() {
        return this.login;
    }

    public void setName(String n) {
        this.name = n;
    }
    public void setLogin(String l) {
        this.login = l;
    }
    public void setPass(String p) {
        this.pass = p;
    }
}