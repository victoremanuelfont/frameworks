# Injeção de dependência em frameworks
Continuação da discussão presente no repositório: https://github.com/victoremanuelfont/injecao-de-dependencia-exemplo


# Sobre o projeto: 
Resolução de um problema utilizando injeção de dependência em frameworks

## Problema discutido
![Questao](https://github.com/victoremanuelfont/injecao-de-dependencia-exemplo/blob/main/imagens/problema-discutido.png) 

# Registro dos componentes
Fazer o primeiro passo para trabalhar com framework: Registrar os componentes. 
Basicamente é colocar as @annotation nas classes que queremos que sejam componentes. 
No caso, foi adicionado a annotation @Service nas classes SalaryService, TaxService e PensionService.
## @Annotation
Annotation = Anotações em Java Spring Boot são metadados usados para fornecer informações sobre o
comportamento de classes, métodos e campos no contexto do framework Spring. 
Elas ajudam a configurar automaticamente componentes e gerenciar a injeção de dependências,
validação, transações e outros aspectos do ciclo de vida do aplicativo Spring Boot.

# Indicar quais componentes dependem de quais
Fazer a injeção de dependência na classe AulaApplication, injetando SalaryService e criando um construtor. 

![Injeção](https://github.com/victoremanuelfont/frameworks/blob/main/imagens/injecao.png)

# Forma alternativa de indicar quais componentes dependem de quais: "@Autowired"
Não precisa de construtor, e adiciona-se a annotation @Autowired nas dependências. 

![Autowired](https://github.com/victoremanuelfont/frameworks/blob/main/imagens/autowired.png)




