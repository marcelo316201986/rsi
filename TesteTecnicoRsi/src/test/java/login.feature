Feature: Realizar a entrada do usuário no sistema

  Scenario: Validar se o sistema esta fazendo o login com sucesso;
    Given o acesso ao sistema;
    And clicar no botao do ultilizador;
    And preencher usuario e senha;
    Then verificar se foi feito login com sucesso;
