# See
# https://github.com/intuit/karate#syntax-guide
# for how to write feature scenarios
Feature: As an api user I want to retrieve some spring boot quotes

  Scenario: Get number of repositories by highest starred
    Given url microserviceUrl
    And path '/git-repo/highest-starred'
    When method GET
    Then status 200
    And match header Content-Type contains 'application/json'
    # see https://github.com/intuit/karate#schema-validation
    * def quoteSchema = { total_count : '#number' ,"incompleteResults": "#boolean", items : [{ name : '#string', description : '#string', language : '#string', watchers_count : '#string', html_url : '#string' } }
    # The response should have an array of 12 quote objects
    And match response == '#[5] quoteSchema'

