Feature: Verify UI Flow of the custom made suite Order

  In this feature Entire UI Flow of the Suites flow has to be Validated
  #This feature is just a dummy implementation of unit tests

  Scenario: Validate the UI Flow Of Suite Ordered
    Given user is accessing suitsupply home page
    When he Navigate to Custom made suit selection
    Then he should view below options to select
    | Option1 | Option2    |  Option3     |  Option4 |  Option5  |  Option6  | Option7              | Option8       | Option9     |
    | FABRIC  | JACKET FIT | TROUSERS FIT | TURN UP  | WAISTBAND | WAISTCOAT | TROUSERS (ADDITIONAL)| TROUSERS SIZE | JACKET SIZE |
    And verify Fabric page has options to filter based on colour and design
    And verify Add To Bag button is disabled