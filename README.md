# Template-Method

Esse projeto tem como objetivo demonstrar o funcionamento do padrão template-method alem de comparar como um projeto sem ele deve ser concebido

primeiro vamos entender o que é o template method

O padrão template method  se trata de construir um "esqueleto" de um algoritmo de uma forma abstrata, e deixasse para que as classes concretas realizem as devidas implementações. O Template Method utiliza uma classe abstrata base, que vai encapsular o template do algoritmo em um método, para que as classes concretas possam herdar desta classe e realizar a implementação de determinados passos deste algoritmo

# Exemplos

1 - Sistema de Relatórios
Um sistema que gera relatórios de diferentes tipos (PDF, CSV, Excel). O algoritmo para geração de relatórios é o mesmo, mas cada tipo de relatório formata o conteúdo de forma diferente.

Classes:

Relatorio (superclasse): Define o esqueleto do método gerarRelatorio(), que chama métodos abstratos como formatarConteudo() e salvarRelatorio().

RelatorioPDF, RelatorioCSV, RelatorioExcel (subclasses): Implementam a formatação e a forma de salvar o relatório para cada tipo.

Método Template: gerarRelatorio() na superclasse define a ordem dos passos, enquanto as subclasses personalizam a formatação e o salvamento.


2 - Sistema de Processamento de Pagamentos
Um sistema de pagamento que suporta diferentes métodos de pagamento (cartão de crédito, PayPal, boleto). O fluxo geral do processamento do pagamento é o mesmo, mas os detalhes de cada método variam.
Classes:

ProcessadorPagamento (superclasse): Define o método processar(), que chama métodos abstratos como validarPagamento() e executarPagamento().

ProcessadorCartaoCredito, ProcessadorPayPal, ProcessadorBoleto (subclasses): Implementam os detalhes de validação e execução para cada método de pagamento.

Método Template: processar() na superclasse define o fluxo padrão de validação e execução do pagamento.


3 - Sistema de Análise de Dados
Um sistema que analisa dados de diferentes fontes (banco de dados, arquivo CSV, API). A estrutura da análise é a mesma, mas o método de obtenção dos dados varia.

Classes:

AnaliseDados (superclasse): Define o método analisar(), que chama métodos abstratos como obterDados() e processarDados().

AnaliseDadosBanco, AnaliseDadosCSV, AnaliseDadosAPI (subclasses): Implementam a obtenção e o processamento de dados específicos de cada fonte.

Método Template: analisar() organiza os passos da análise de dados, enquanto as subclasses personalizam a origem e o formato dos dados.


# Quando Usar o Template Method


Quando várias classes que compartilham uma lógica comum, mas precisam lidar com variações em alguns pontos específicos.

O comportamento compartilhado deve ser definido uma vez e reutilizado por várias subclasses, permitindo que cada subclasse customize partes específicas sem duplicar o código.

Facilidade de manutenção: Mudanças no comportamento comum são centralizadas na superclasse, tornando o código mais fácil de manter e adaptar.


# Vantagens

Reutilização de Código: Evita duplicação de código comum entre classes, o que facilita a manutenção e legibilidade.

Flexibilidade: As subclasses podem alterar apenas os detalhes específicos do comportamento, sem modificar o fluxo principal.

Centralização de Mudanças: Alterações no comportamento comum são feitas em um único local (na superclasse), refletindo automaticamente em todas as subclasses.


# Desvantagens

Fragilidade em Caso de Alterações : O Template Method centraliza o comportamento comum na superclasse, o que significa que qualquer mudança nessa lógica comum pode afetar todas as subclasses. isso pode quebrar a funcionalidade de outras subclasses inesperadamente.

Excesso de Responsabilidade na Superclasse : A superclasse que define o método template pode acabar assumindo muitas responsabilidades, já que ela coordena o fluxo principal e precisa estar ciente de todos os detalhes comuns e específicos das subclasses.

Dificuldade na Extensão: Quando o número de subclasses aumenta, a manutenção e a evolução do template method se tornam mais complexas. Subclasses que precisam personalizar fortemente o comportamento podem ter que sobrescrever muitos métodos, o que anula os benefícios de reutilização e pode gerar código difícil de acompanhar.

