Feature: Search Google
  Do a simple search

  Scenario: Search for cheese
    * configure driver = { type: 'chromedriver', port: 9515, executable: '/home/markus/Git/java-examples/karate/lib/chromedriver' }
    Given driver 'https://google.com'
    And input('input[name=q]', 'cheese')
    When click('input[name=btnK]')
    Then match text('#rso > div:nth-child(2)') contains 'Cheese'
