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

***Inserir Elementos no HashSet***

---

> Para criar elementos em um HashSet basta inserir .add após a variável, lembrando que valores não podem ser repetidos em um HashSet, não vai dar erro mas também nã fará nada caso tenho dois .add com o mesmo valor. 
>
> linguagens.add("Java");
> linguagens.add("C#");
> linguagens.add("Java"); //Como citado, não ocorrerá erro, mas também não irá inserir o "Java" novamente pois já existe, e o HashSet não permite duplicidade. 
> linguagens.add("Javascript");
> linguagens.add("Delphi");

---

***Deletar itens no HashSet***

---

> Para remover é possível informando como argumento o próprio item que deseja remover.
>
> linguagens.remove("Javascript");
>
> Também é possível deletar todos os itens com :
> linguagens.clear();

---

### *Crud - (Create, Read, Update and Delete)*

---

> CRUD é basicamente uma metodologia para *Criar*(Create), *Ler*(READ), *Atualizar*(Update) e *Deletar*(Delete) objetos.

---

### *HashMap*

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

***Criar elementos em um HashMap***

> Para criar um elemento no HashMap usamos .put após a variável criada, e colocamos valores de acordo com o tipo de variável declarada.
>
> Exemplo:
>
>  HashMap<String\, String\> estados = new HashMap<>();

> estados.put("CE", "Ceará")
> estados.put("SC", "Santa Catarina")

---

***Deletar itens no HashMap***

---

> Para remover é possível informando como argumento o próprio item que deseja remover.
>
> estados.remove("SC", "Santa Catarina");
>
> Também é possível deletar todos os itens com :
> linguagens.clear();

---

## *Generics*

---

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

---

## *Expressões Lambda*

---

> As expressões tem o objetivo de reduzir o esforço na geração de código e tem muito poder e performance em sua execução.
>
> Muito utilizado em Collections mas também é possível fazer todo tipo de ação com as expressões Lambda.

---

## *Datas*

---

### *Datas para Computadores*

---

> ara um computador, o tempo é um número que cresce a cada instante. No Java, historicamente era utilizado um long que representava os milissegundos desde 01/01/1970 às 00:00:00. Na nova API, a classe Instant é utilizada para representar esse número, agora com precisão de nanossegundos.
>
> Instant agora = Instant.now();
>
> System.out.println(agora); //YYY-MM-ddThh:mm:ss. formato ISO-8601) 
>
> Podemos usar um Instant, por exemplo, para medir o tempo de execução de um algoritmo.
>
> Instant inicio = Instant.now(); 
>
> rodaAlgoritmo(); 
> 
> Instant fim = Instant.now();
>
> Duration duracao = Duration.between(inicio, fim); 
>
> long duracaoEmMilissegundos = duracao.toMillis(); 
>
> Observe que utilizamos a classe Duration. Essa classe serve para medir uma quantidade de tempo em termos de nanossegundos. Você pode obter essa quantidade de tempo em diversas unidades chamando métodos como toNanos, toMillis, getSeconds, etc.

---

### *Datas para Humanos*

---

> Já para um humano, há uma divisão do tempo em anos, meses, dias, semanas, horas, minutos, segundos e por aí vai. Temos ainda fusos horários, horário de verão e diferentes calendários.
>
> Várias questões surgem ao considerarmos a interpretação humana do tempo. Por exemplo, no calendário judaico, um ano pode ter 13 meses. As classes do pacote java.time permitem que essas interpretações do tempo sejam definidas e manipuladas de forma precisa, ao contrário do que acontecia ao usarmos Date ou Calendar.
>
> Temos, por exemplo, a classe LocalDate que representa uma data, ou seja, um período de 24 horas com dia, mês e ano definidos.
>
> LocalDate hoje = LocalDate.now(); 
>
> System.out.println(hoje); //YYYY-MM-DD(formato ISO-8601) 
>
> LocalDate emissaoRG = LocalDate.of(2000, 1, 15); 
>
> Note que utilizamos o valor 1 para representar o mês de Janeiro. Poderíamos ter utilizado o enum Month com o valor JANUARY. Há ainda o enum DayOfWeek, que representa os dias da semana.
>
> Para calcularmos a duração entre dois LocalDate, devemos utilizar um Period, que já trata anos bissextos e outros detalhes.
>
> LocalDate homemNoEspaco = LocalDate.of(1961, Month.APRIL, 12);
>
> LocalDate homemNaLua = LocalDate.of(1969, Month.MAY, 25);
> Period periodo = Period.between(homemNoEspaco, homemNaLua);
>
> // periodo.getYears() , periodo.getMonths(), periodo.getDays()); //8 anos, 1 mês e 13 dias
>
> Já a classe `LocalTime` serve para representar apenas um horário, sem data específica. Podemos, por exemplo, usá-la para representar o horário de entrada no trabalho.
>
> LocalTime horarioDeEntrada = LocalTime.of(9, 0); System.out.println(horarioDeEntrada); //09:00 
>
> A classe LocalDateTime serve para representar uma data e hora específicas. Podemos representar uma data e hora de uma prova importante ou de uma audiência em um tribunal.
>
> LocalDateTime agora = LocalDateTime.now(); LocalDateTime aberturaDaCopa = LocalDateTime.of(2014, Month.JUNE, 12, 17, 0); System.out.println(aberturaDaCopa); //2014-06-12T17:00 (formato ISO-8601).

---

### *Manipulando Datas*

---

> Todas as classes mencionadas possuem diversos métodos que permitem manipular as medidas de tempo. Por exemplo, podemos usar o método plusDays da classe LocalDate para aumentarmos um dia:
>
> LocalDate hoje = LocalDate.now(); LocalDate amanha = hoje.plusDays(1); 
>
> Outro cálculo interessante é o número de medidas de tempo até uma determinada data, que podemos fazer através do método until. 
>
> Para descobrir o número de dias até uma data, por exemplo, devemos passar ChronoUnit.DAYS como parâmetro. 
>
> MonthDay natal = MonthDay.of(Month.DECEMBER, 25); 
> 
> LocalDate natalDesseAno = natal.atYear(Year.now().getValue());
>
> long diasAteONatal = LocalDate.now() .until(natalDesseAno, ChronoUnit.DAYS);

---

## *Annotations (Anotações)*

---

> Para definir uma anotação no código Java, usamos o símbolo arroba (@) seguido do nome da mesma. Dependendo da categoria da annotation, pode ser necessário incluir dados a ela, no formato de pares nome=valor. 
>
> São três as categorias de anotações:
> ---
> - `Anotações marcadoras` – são aquelas que não possuem membros. São identificadas apenas pelo nome, sem dados adicionais. Por exemplo, @Override é uma anotação marcadora;
> ---
> - `Anotações de valor único` – são similares às anteriores, no entanto, possuem um único membro, chamado valor. Elas são representadas pelo nome da anotação e um par nome=valor, ou simplesmente com o valor, entre parênteses. Em outras palavras, quando a anotação possui um único membro, só é necessário informar o valor, além do nome da anotação. Por exemplo, @MinhaAnotacao(“valor”) é um exemplo de sintaxe deste tipo de anotação;
> ---
> -  `Anotações completas` – são aquelas que possuem múltiplos membros. Portanto, neste tipo, devemos usar a sintaxe completa para cada par nome=valor. Neste caso, cada par é informado separado do outro por uma vírgula. Por exemplo, @Version(major=1, minor=0, micro=0) é um caso de anotação completa.

---

***Tipos de Anotações Padrão***

---

> Os tipos anotação padrão são aquelas providas como parte do Java no pacote java.lang. Essas anotações podem ser utilizadas sem qualquer esforço adicional em suas aplicações, pois, visto que são parte de java.lang, nem mesmo precisam ser importadas.
>
**@Override**
>
> É uma anotação marcadora que deve ser usada apenas com métodos. Serve para indicar que o método anotado está sobrescrevendo um método da superclasse.
>
> **@Deprecated**
>
> @Deprecated, assim como @Override, é também uma anotação marcadora. Esta anotação é utilizada quando é necessário indicar que um método não deveria mais ser usado, ou seja, informa que o método está obsoleto. 
> 
> Diferente de @Override, @Deprecated deve ser colocada na assinatura do método
>
> Por que simplesmente não removemos o método obsoleto?
> E a resposta é que precisamos manter a compatibilidade com sistemas legados que usam a classe. 
>
> Ou seja, mesmo implementando uma nova versão de um método, os sistemas que já existem precisam continuar funcionando. 
>
> Os programadores serão então alertados da mudança e gradativamente irão modificando suas aplicações para se adaptar à nova versão da classe.
>
> O uso dessa anotação não provoca qualquer erro durante a compilação, quando utilizamos um método marcado com ela, seja sobrescrevendo-o ou fazendo uma chamada a ele. Se desejarmos, o compilador apenas emitirá um alerta de que o método está obsoleto.
>
> **@SuppressWarnings**
>
> Aplicações criadas antes do advento do Java 5 podem ter algum código que gera alertas (warnings) durante a compilação com esta versão ou posteriores. É o caso das collections, nas quais o Java 5 permite o uso de generics para a especificação de tipos.

---

***Criar Anotações e adicionar membros ao tipo de Anotação***

---

> Uma declaração de tipo anotação é na verdade uma espécie de declaração de interface. Apenas para distinguir uma declaração da outra, a palavra-chave interface é precedida por um arroba (@) quando queremos declarar um tipo anotação.
> Um elemento em um tipo anotação é definido por uma declaração de método.

> /**
>
> * Tipo anotação para indicar que uma coisa não pode ser esquecida
>
> */
>
> public @interface Lembrete {
>
> String value();
>
> }
>
// utilizando
>
> @Lembrete(value = "o value esta lá na interface e o conteudo fica aqui")
>
> private static void detalharAtributo() {
>
> }

---