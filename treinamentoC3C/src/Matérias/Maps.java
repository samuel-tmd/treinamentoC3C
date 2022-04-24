package Matérias;

//import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Hashtable;

public class Maps {

    public static void main(String[] args) 
    {
        //TestaInterfaceMap();
        //maisMetodos();
        //OrdenandoHashMap();
        //TesteHashTable();
    }

    public static void TestaInterfaceMap() 
    {
        Map<Integer, String> mapaNomes = new HashMap<Integer, String>();
        mapaNomes.put(1, "João Delfino");
        mapaNomes.put(2, "Maria do Carmo");
        mapaNomes.put(3, "Claudinei Silva");

        System.out.println(mapaNomes);

        //resgatando o nome da posição 2
        System.out.println(mapaNomes.get(2));

        //For com o Map
        for(int i = 1; i <= mapaNomes.size(); i++)
        {
            System.out.println(i + " - " + mapaNomes.get(i));
        }
    }

    public static void maisMetodos() 
    {
        Map<Integer, String> mapaNomes = new HashMap<Integer, String>();
        mapaNomes.put(1, "João Delfino");
        mapaNomes.put(2, "Maria do Carmo");
        mapaNomes.put(3, "Claudinei Silva");

        //Collection<Integer> conjNomes = mapaNomes.keySet();
        Set<Entry<Integer, String>> set = mapaNomes.entrySet();
        
        System.out.println("Código\t\tValor");

        //getKey() - recupera a chave do mapa
        //getValue() - recupera o valor do mapa

        Iterator it = set.iterator();
        while(it.hasNext())
        {
            Entry<Integer, String> entry = (Entry)it.next();
            System.out.println(entry.getKey() + "\t\t"+entry.getValue());
        }
    }
    public static void OrdenandoHashMap() 
    {
        HashMap<Integer, String> mapaNomes = new HashMap<Integer, String>();
        mapaNomes.put(1, "João Delfino");
        mapaNomes.put(2, "Maria do Carmo");
        mapaNomes.put(3, "Claudinei Silva");
        mapaNomes.put(4, "Amélia Mourão");

        Maps x = new Maps();

        ComparatorInts compInt = x.new ComparatorInts(mapaNomes);
    
        Map<Integer, String> mapaOrdenado = new TreeMap(compInt);
        mapaOrdenado.putAll(mapaNomes);
    
        for(Integer valor : mapaOrdenado.keySet())
        {
          System.out.println(valor + " " + mapaNomes.get(valor));
        }
    
    }

    public static void TesteHashTable() {
        
        Maps x = new Maps();

        Cliente c1 = x.new Cliente("754.856.869-88","Valdinei Santos");
        Cliente c2 = x.new Cliente("828.929.222.12","Claire Moura");
        Cliente c3 = x.new Cliente("156.565.556-88","Vagner Seller");
    
        Hashtable<Integer, Cliente> ht = new Hashtable<Integer, Cliente>();
        ht.put(1, c1);
        ht.put(2, c2);
        ht.put(3, c3);
    
        System.out.println("CPF \t\t Cliente");
        for (int i = 1; i <= ht.size(); i++) {
          System.out.println(ht.get(i));
        }
      }
    
    class ComparatorInts implements Comparator<Integer> 
    {
        Map<Integer, String> base;
    
        public ComparatorInts(Map<Integer, String> base) 
        {
            this.base = base;
        }
    
        @Override
        public int compare(Integer o1, Integer o2) 
        {
            return base.get(o1).compareTo(base.get(o2));
        }
    }

    class Cliente
    {
        public String cpf;
        public String nome;
      
        public Cliente(String cpf, String nome)
        {
          this.cpf = cpf;
          this.nome = nome;
        }
      
        @Override
        public String toString()
        {
          return cpf + " | " + nome;
        }
    }
}
