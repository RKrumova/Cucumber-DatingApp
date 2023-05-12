Feature: Свързване на потребители
  Scenario Outline: Свързване на потребители
    Given Отваряме екран на който да разглеждаме потребители
    When Имаме статичен потребител "statUser"
    And Получаваме потребител на който да реагираме "<user>"
    And Плъзнете/преместваме на "<swipeDirection>"
    And Получаваме отговор за "<swipeDirectionUser2>"
    Then Проверяваме дали съвпадат и получаваме "<matchMessage>"
    Examples:
      | user | swipeDirection | swipeDirectionUser2 | matchMessage |
    | petya| like           | like                | You matched  |
    |petya2|like            | dislike             | You didn't matched|
    |ivan21| like           |                     | Hasn't seen you yet|
    |georgy| dislike        | like                | You didn't match   |
    | dimi | dislike        | dislike             | You didn't match   |
