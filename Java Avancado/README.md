# Java Avançado

## *Classes Wrappers*

> Os Wrapper são conhecidos na linguagem Java como classes especiais que possuem métodos capazes de fazer conversões em variáveis primitivas e também de encapsular tipos primitivos para serem trabalhados como objetos.
>
> Sendo assim, existe uma classe Wrapper para cada tipo primitivo identificado pelo mesmo nome do tipo que possui e tendo a primeira letra maiúscula. Essa regra de declaração é aplicada a todos os tipos, exceto aos que são char classificados como Character e int como Integer.
>
> Exemplos
>
> - char letra = Character.valueOf('A');
> - boolean verdade = Boolean.parseBoolean("TRUE");
> - boolean verdade1 = Boolean.parseBoolean("tRue");
> - boolean verdade2 = Boolean.parseBoolean("true");
> - boolean falso = Boolean.parseBoolean("t");
> - byte inteiro1 = Byte.parseByte("127");
> - short inteiro2 = Short.parseShort("128");
> - int inteiro3 = Integer.parseInt("600000");
> - long inteiro4 = Long.parseLong("15000000");
> - float decimal1 = Float.parseFloat("1000.10");
> - double decimal2 = Double.parseDouble("1500.65");

---

## *ENUM*

> O Java enum é um tipo de dado utilizado para armazenar um conjunto de valores constantes, ou seja, são valores fixos, que não podem ser modificados. Na prática, o enum é um tipo especial de classe que utiliza a palavra-chave enum ao ser declarado.
>
> Os itens de um enum são separados por vírgula, e devem ser declarados com letra maiúscula. Vale ressaltar que a palavra enum representa a abreviação de enumerations, ou enumerações, em português.
>
 **Sintaxe**

> modificadores_de_visibilidade enum nomeEnum {
> VALOR1,
>
> VALOR2,
>
> ...,
>
> VALORN
>
> }
>
> - modificadores_de_visibilidade: não é obrigatório e representa a autorização de uso do recurso por outras partes do código, como public, private e protected;
> - enum: palavra-chave necessária para declarar uma classe do tipo enumerador em Java;
> - nomeEnum: indica o nome de identificação do enum;
> - VALOR1, VALOR2, …, VALORN: representam os valores específicos de cada constante, e devem ser declarados em maiúscula, obrigatoriamente.
>
> A declaração do enum pode ser feita dentro ou fora de uma classe, entretanto, não pode ocorrer dentro de um método.

---

## *Collections*

> 1.List
>
> - ArrayList
> - LinkedList
>
> 2.Set
>
> - HashSet
>
> 3.Map
>
> - HashMap

---

### *ArrayList*

> Para criar um objeto do tipo ArrayList utilizamos o operador new.
> Ao declarar a referência a uma ArrayList, passamos qual o tipo de objeto com o qual ela trabalhará, ou seja, um tipo de variável ou uma classe.
> Se queremos uma lista de nomes de aulas, vamos declarar ArrayList<String>.
>
> ArrayList<String\> aulas = new ArrayList<>();
>
> Para saber o tamanho do array utilize o método size.
>
> aulas.size()

---

***Como inserir elementos em uma ArrayList:***

---

> É possível aproveitar o momento da criação para definir itens:
>
> ArrayList<String> cidades = new ArrayList<>(Arrays.asList("João Pessoa", "Blumenau", "Florianopolis"));
>
> Ou criar vazio e adicionar depois:
>
> ArrayList<String> cidades = new ArrayList<>();
>
> cidades.add("Cabedelo");
>
> cidades.add("Pomerode");
>
> Mesmo uma lista pré inicializada pode adicionar itens, pois não existe mais limitação por tamanho.

---

***Percorrer uma ArrayList:***

---

> System.out.println("---------------Percorrendo itens no ARRAY com iteração em array------------------");
> System.out.println("Historicos de cargo");
>
> for (String cargo : cargos) {
>
> System.out.println("Cargo = " + cargo);
>
> }
>
>
>> System.out.println("---------------Percorrendo itens no ARRAY com index em array------------------");
> System.out.println("De forma inversa");
>
> for (int cargo = cargos.size() - 1; cargo >= 0; cargo--) {
>
> System.out.println("(" + cargo + ") cargo = " + cargos.get(cargo));
>
> }
>
>
> System.out.println("---------------Percorrendo itens no ARRAY com forEach------------------");
> cargos.forEach(cargo -> {
>
> System.out.println("Percorrendo:");
>
> System.out.println("Cargo " + cargo);
>
> });

---

***Como acessar um elemento por indice no ArrayList***

---
>
> System.out.println("Nome da primeira cidade " + cidades.get(0));
>
> System.out.println("Nome da ultima cidade " + cidades.get(cidades.size()-1));

 ---

 ***Remover itens no ArrayList***

---

> System.out.println("---------------Removendo itens no ARRAY ------------------");
>
> System.out.println("Removendo quem estava no indice 0 ou seja "+cargos.get(0));
>
> cargos.remove(0);//removi o item no indice 0
>
> System.out.println("Removendo quem o cargo \"Programador sr\" pelo valor, sem saber que esta no indice "+cargos.indexOf("Programador sr"));
>
> cargos.remove("Programador sr");//remove o elemento que tiver esse valor, o indice será procurado
---

### *LinkedList*

> O LinkedList tem um proposito semelhante ao ArrayList, porem tem métodos específicos para o gerenciamento da lista
>
> Para criar um LinkedList:
>
> LinkedList<String> nomes = new LinkedList<>();

---

***Como inserir elementos no LinkedList***

---

> LinkedList<String> nomes = new LinkedList<>();
>
> System.out.println("---------------Inserindo itens no LINKED ------------------");
>
>> nomes.add("Alex");
>
> nomes.add("João");
>
> nomes.addFirst("Primeiro");
>
> nomes.addLast("Ultimo");
>
> nomes.add(2, "Inserido");
> System.out.println("Quantos nomes? "+nomes.size());


 ---

***Como percorrer um LinkedList***

---

> System.out.println("---------------Percorrendo itens no LINKED com iteração em array------------------");
> System.out.println("Ordem de inserção");
>
> for (String nome : nomes) {
>
> System.out.println("nome = " + nome);
> }
>
>
> System.out.println("---------------Percorrendo itens no LINKED com index em array------------------");
> System.out.println("De forma inversa");
>
> for (int nome = nomes.size() - 1; nome >= 0; nome--) {
>
> System.out.println("(" + nome + ") cargo = " + nomes.get(nome));
>
> }
>
>
> System.out.println("---------------Percorrendo itens no LINKED com forEach------------------");
> nomes.forEach(nome -> {
>
> System.out.println("nome " + nome);
>
> });

---

 ***Como acessar um elemento no LinkedList***

---

> System.out.println("---------------Acessando itens no LINKED ------------------");
>
> System.out.println("Quem é o primeiro? " + nomes.getFirst());
>
> System.out.println("Quem é o segundo? " + nomes.get(1));
>
> System.out.println("Quem é o ultimo? " + nomes.getLast());

---

 ***Remover itens no LinkedList***

---

> System.out.println("---------------Removendo itens no LINKED ------------------");
>
> System.out.println("Removendo quem estava no indice 0 ou seja "+nomes.getFirst());
>
> nomes.removeFirst();//removi o item no indice 0
>
> System.out.println("Removendo quem tem o nome \"Fulano\" pelo valor, sem saber que esta no indice "+nomes.indexOf("Fulano"));
>
> nomes.remove("Fulano");//remove o elemento que tiver esse valor, o indice será procurado
 
---

 ### *HashSet*

---

> Uma collection especial e que possui regras de utilização.
> Ela não permite de duplicidades, então o mesmo objeto não é inserido novamente na coleção, mesmo que essa tentativa seja executada, nenhum erro será gerado, apenas a tentativa será ignorada.
> Ao percorrer os itens é possível perceber que a ordem não obedece a inserção ou critério alfabético.
> A ordem é definida pela coleção pelo critério próprio de seu algoritmo.
> Também não é possível trocar o objeto inserido por outro (ou seja atualizar), mas se for um objeto com atributos é possível encontra-lo e alterar seus valores.

---

***Sintaxe***

---

> HashSet<String\> linguagens = new HashSet<String\>();

---

### *Crud - (Create, Read, Update and Delete)*

---

***Criar elementos no HashSet***

---

> linguagens.add("Java");
>
> linguagens.add("C#");
> linguagens.add("Java");
> linguagens.add("Javascript");
> linguagens.add("Delphi");
> linguagens.add("Kotlin");
> linguagens.add("Java");
> linguagens.add("RubemOliotaLang");
> linguagens.add("C");
> linguagens.add("C#");

> Itens que já existem não se repetem.
>
> linguagens.addAll(new ArrayList<>(Arrays.asList("Angular", "Typescript")));
>
> Também é possível inserir outra coleções que respeitem o tipo de <ClasseItem> declarada na definição do HashSet.

---

***Ler informações de um HashSet***

---

>       System.out.println("Quantidade de elementos " + linguagens.size());
>
> System.out.println("A lista está vazia ? " + (linguagens.isEmpty() ? "Sim" : "Não"));
>
>       System.out.println("------  Listando elementos -----");
>
> System.out.println(linguagens);
>
>
> System.out.println("-------------");
>
>for (String linguagen : linguagens) {
>
>System.out.println("Linguagem = " + linguagen);
>
>}
>
>       System.out.println(" -----  Procurando elementos -----");
>
> System.out.println("Java esta nessa lista? " + (linguagens.contains("Java") ? "Sim" : "Não"));
>
> System.out.println("Advpl esta nessa lista? " + (linguagens.contains("Advpl") ? "Sim" : "Não"));

---

***Atualizar informações no HashSet***

---

> Trocar um objeto que existe por outro não é possivel sem remover e colocar outro em seu lugar e mesmo assim a ordem pode ser outra.
>
>Exemplo:
>
>Antes:
>
> [C#, Java, C, Typescript, Javascript, Delphi, RubemOliotaLang, Angular, Kotlin]
>
>
>
> linguagens.remove("Javascript");
>
> linguagens.add("Javascript2");
>
> Depois:
>
> [C#, Java, C, Typescript, Javascript2, Delphi, RubemOliotaLang, Angular, Kotlin]
>
> Mas para objetos que possuem vários atributos é possível alterar os detalhes que o objeto continua no Set, porém é necessário verificar se ele existe, percorrer o HashSet para encontra o item que deseja atualizar
>
> HashSet<Pessoa> pessoas = new HashSet<>();
>
> pessoas.add(pessoa1);
> pessoas.add(pessoa2);
> pessoas.add(pessoa3);
>
> System.out.println("--------- listando pessoas antes --------------");
>
> for (Pessoa pessoa : pessoas) {
>
> System.out.println(pessoa.getNome() + "-" + pessoa.getIdade());
>
> }
>
> Pessoa busca = null;
>
> if (pessoas.contains(pessoa2)) {
>
> for (Pessoa pessoa : pessoas) {
>
> if (pessoa.getNome().equals(pessoa2.getNome())) {
>
> pessoa.setNome("OUTRO NOME");
>
> break;
>
> }
>
> }
>
> }
>
> System.out.println("--------- listando pessoas depois --------------");
>
> for (Pessoa pessoa : pessoas) {
>
> System.out.println(pessoa.getNome() + "-" + pessoa.getIdade());
>
> }

---

***Deletar itens no HashSet***

---

> Para remover é possível informando como argumento o próprio item que deseja remover
>
> linguagens.remove("Typescript");
>
> Também é possível deletar todos os itens com :
>
> linguagens.clear();

---

> ### *HashMap*

---

> Uma collection especial e que possui regras de utilização
>
> É uma lista dupla com chaves únicas e para cada chave um valor 
>
> Ela não permite de duplicidades, pois utiliza chave e valor, então quando há uma inserção duplicada o registro será atualizado.
>
> Ao percorrer os itens é possível perceber que a ordem não obedece a inserção ou critério alfabético.
>
> A ordem é definida pela coleção pelo critério próprio de seu algoritmo.

---

***Sintaxe***

---

> HashMap<Tipo,Tipo> alunos= new HashMap<>();

---

***Criar elementos no HashMap***

---

> System.out.println("========  CREATE  verificar debug ================");
>
> System.out.println("PUT por padrão o PUT inserte ou atualiza ");
>
> estados.clear();
> estados.put("CE", "Ceará");
> estados.put("AL", "Alagoas");
> estados.put("DF", "Distrito Federal");
> estados.put("AC", "Acre");
> estados.put("ES", "Espírito Santo");
> estados.put("AP", "Amapá");
> estados.put("AM", "Amazonas");
> estados.put("BA", "Bahia");
> estados.put("PB", "Paraíba");
> estados.put("GO", "Goiás");
> estados.put("SC", "Santa Catarina");
>
> System.out.println(estados);

---

***Ler informações de um HashMap***

---

>       System.out.println("========  READ ================");
>
> É possível ler dados gerais sobre a collection com isEmpty ou size.
>
> System.out.println("A lista está vazia ? " + (estados.isEmpty() ? "Sim" : "Não"));
>
> System.out.println("Quantidade de elementos " + estados.size());
>
> Para listar os elementos é necessário informar como deseja percorrer, pois a lista é composta por 2 listas em paralelo (chaves e valores).
>
>       System.out.println("------  Listando elementos de forma simples -----");
>
> System.out.println(estados);
>
> O for aprimorado ou forEach trabalha com uma variável temporária enquanto percorre uma lista e nesse caso vamos percorrer a lista de chaves.
>
> O método values devolve uma lista no formato "Tipo" que pode ser Iterado em um forEach.
>       System.out.println("-----listar as chaves por padrão--------");
>
> for (String estado : estados.keySet()) {
>
> System.out.println("Estado : " + estado);
>
> }
>
> O for aprimorado ou forEach trabalha com uma variável temporária enquanto percorre uma lista e nesse caso vamos percorrer a lista de valores
>
> O método values devolve uma lista no formato "Tipo" que pode ser Iterado em um forEach
> 
>       System.out.println("--------listar apenas valores----------------");
>
> for (String estado : estados.values()) {
>
> System.out.println("Estado : " + estado);
>
> }
>
> O for aprimorado ou forEach trabalha com uma variável temporária enquanto percorre uma lista e nesse caso vamos percorrer a lista em detalhes.
>
> O método entrySet devolve uma lista no formato Entry que pode ser Iterado em um forEach mas no formato de Map.
>
>       System.out.println("--------listar todos os detalhes----------------");
>
> for (Entry<String, String> estado : estados.entrySet()) {
>
> System.out.println("Estado : " + estado);
>
> System.out.println("\tKey : " + estado.getKey());
>
> System.out.println("\tValue : " + estado.getValue());
>
> }
>
> Para verificar se a lista tem determinada chave utilize o método containsKey(AceitaUmaChaveParaBusca) retornando um boolean para tomada de decisão.
>
>       System.out.println(" -----  Procurando elementos por chave-----");
>
> System.out.println("PB é uma chave nessa lista? " + (estados.containsKey("PB") ? "Sim" : "Não"));
>
> System.out.println("PE é  uma chave nessa lista? " + (estados.containsKey("PE") ? "Sim" : "Não"));
>
> Para verificar se a lista tem determinado item ou valor utilize o método containsValue(AceitaUmObjetoOuValor) retornando um boolean para tomada de decisão.
>
>       System.out.println(" -----  Procurando elementos por valor-----");
>
> System.out.println("Paraíba é um valor nessa lista? " + (estados.containsValue("Paraíba") ? "Sim" : "Não"));
>
> System.out.println("Pernambuco é um valor nessa lista? " + (estados.containsValue("Pernambuco") ? "Sim" : "Não"));
>
> Há 3 formas de obter um objeto sem a necessidade de percorrer a lista
>
>       System.out.println(" -----  Obter um elemento por chave-----");
>
> String obter1 = estados.get("DF");
>
> System.out.println("Tentei buscar pela chave DF será que existe? " + (obter1 != null ? "Sim" : "Não"));
>
> String obter2 = estados.get("RR");
>
> System.out.println("Tentei buscar pela chave RR será que existe? " + (obter2 != null ? "Sim" : "Não"));
>
> String obter3 = estados.getOrDefault("RO", "Não achei, tentei usar a chave RO");
>
> System.out.println("Tentei buscar pela chave RO ... " + obter3);

---

***Atualizando informações no HashMap***

---

>       System.out.println("======== UPDATE por padrão o PUT inserte ou atualiza ================");
>
> System.out.println("----- basta informar uma chave existente e um valor novo");
>
>       System.out.println("--------- listando estados antes --------------");
>
> for (Entry<String, String> estado : estados.entrySet()) {
>
> System.out.println("Estado : " + estado);
>
> System.out.println("\tKey : " + estado.getKey());
>
> System.out.println("\tValue : " + estado.getValue());
>
> }
>
> estados.put("SC", "Santa Catarina (Atualizado)");
>
>       System.out.println("--------- listando estados depois --------------");
>
> for (Entry<String, String> estado : estados.entrySet()) {
>
> System.out.println("Estado : " + estado);
>
> System.out.println("\tKey : " + estado.getKey());
>
> System.out.println("\tValue : " + estado.getValue());
>
> }

---

***Deletando itens no HashMap***

---

>       System.out.println("======== DELETE ================");
>
> System.out.println("--------- listando estados antes =" + estados.size() + "--------------");
>
> for (Entry<String, String> estado : estados.entrySet()) {
>
> System.out.println("Estado : " + estado);
>
> System.out.println("\tKey : " + estado.getKey());
>
> System.out.println("\tValue : " + estado.getValue());
>
> }
>
> estados.remove("OPA");
>
> estados.remove("SC", "Santa Catarina (Atualizado)");
>
>       System.out.println("--------- listando estados depois =" + estados.size() + "--------------");
>
> for (Entry<String, String> estado : estados.entrySet()) {
>
> System.out.println("Estado : " + estado);
>
> System.out.println("\tKey : " + estado.getKey());
>
> System.out.println("\tValue : " + estado.getValue());
>
> }

## *Generics*

> Generics é uma forma de preparar declarações onde o tipo será dinâmico.
>
> Um bom exemplo para isso é quando criamos interfaces que tem o proposito de determinar quais comportamentos e cada classe tem a responsabilidade de implementar a sua maneira.
> 
> Quando as declarações na interface não envolvem parâmetros ou retornos específicos , tudo bem, mas quando envolve é necessário utilizar generics caso contrario as classes que implementam a interface não teriam ganho algum.

***Tipos de Utilização***

> public interface ICrud<T> {
>
>   public T metodo1(); // 1º forma de generics, retornar um 'Tipo' que eu ainda nem sei oq é
>
>   public void metodo2(T parametro1); // 2º forma de generics, solicitar parâmetro de um 'Tipo' que eu ainda nem sei oq é
>
>   public T metodo3(T parametro1); // 3º forma de generics, retornar e solicitar parâmetro de um 'Tipo' que eu ainda nem sei oq é
>
> public void listar(HashMap<String, T> lista); // Utilização com quem já gerencia, solicitar parâmetro de uma Collection  que gerencia uma chave String e o valor é um  'Tipo' que eu ainda nem sei oq é
>
> }
>
> para consumir em uma classe 
>
> implements ICrud<Pessoa>
>
> Ao escrever os métodos não implementados onde tinha T na declaração será substituido por Pessoa.

---

## *Exceções*

---

> As exceções ocorrem quando algo imprevisto acontece, elas podem ser provenientes de erros de lógica ou acesso a recursos que talvez não estejam disponíveis.
>
>Alguns possíveis erros de lógica para ocorrer uma exceção são:
>
> - Tentar manipular um objeto que está com o valor nulo.
> - Dividir um número por zero.
> - Tentar manipular um tipo de dado como se fosse outro.
> - Tentar utilizar um método ou classe não existentes.

---

***Tratando as exceções***

---

> Uma maneira de tentar contornar esses imprevistos é realizar o tratamento dos locais no código que podem vir a lançar possíveis exceções.
> 
> Para tratar as exceções em Java são utilizados os comandos try e catch.
>
> try{ … } - Neste bloco são introduzidas todas as linhas de código que podem vir a lançar uma exceção.
>
> catch(tipo_excessao e) { … } - Neste bloco é descrita a ação que ocorrerá quando a exceção for capturada.

---

***Sintaxe***

> try
>
> {
>
>  //trecho de código que pode vir a lançar uma exceção
>
> }
>
> catch(tipo_exceçao_1 e)
>
> {
>
>  //ação a ser tomada
>
> }
>
> catch(tipo_exceçao_2 e)
>
> {
>
>  //ação a ser tomada
>
> }
>
> catch(tipo_exceçao_n e)
>
> {
>
>  //ação a ser tomada
>
> }