Considere as classes abaixo que podem ser utilizadas para a manipulação de
informações de mídias digitais, como vídeos e ebooks.

````java
import java.time.LocalDate;
class Video {
  String titulo;
  int duracao;
  String url;
  LocalDate dataPublicacao;
}
class Ebook {
  String url;
  LocalDate dataPublicacao;
}
````

a) Complemente as classes inserindo campos para descrição, autor e número de
curtidas de um vídeo, além do número de páginas e autor de um ebook (Obs.:
Considere um único autor para simplificação da resolução).
b) Identifique campos comuns das classes existentes e crie uma nova classe,
chamada Midia, para contê-los. Faça com que as classes Video e Ebook se
aproveitem dessa definição única.
c) Crie construtores para as classes existentes, de maneira a facilitar a criação de
objetos destas classes.
d) Defina uma classe chamada Principal, a qual deve possuir um método main() para
inicialização do sistema. Instancie os objetos abaixo neste método main():

|Tipo| Autor| Url| Data| Título| Duração(seg)| Descrição| Curtidas|
|---|---|---|---|---|---|---|---|
Vídeo| Carlos Bazilio| https://www.youtube.com/watch?v=bdpSqjTZJcg |22/08/2017| Por quê ainda estudar Java?| 998| Razões para ainda se estudar a linguagem Java| 11|
