Feature: Validate the UserPatch API

  Scenario: Validate the PATCH API Response
    Given Read the baseUrl with Endpoint
    When Add the Headers to API
    And Provide  Query Parameters
    Then Validate the patch response
