Feature: Verify User is able to custom made choices to his suite

  In this feature Positive flow of Add to cart functionality of suit is verified

  Scenario Outline: Verify users are able to add custom made suit to cart
    Given user is accessing custom made suit selection page
    When he chooses <FABRIC>,<JACKET FIT>,<TROUSERS FIT>,<TURN UP>,<WAISTBAND>,<WAISTCOAT>,<TROUSERS (ADDITIONAL)>,<TROUSERS SIZE>,<JACKET SIZE>
    And proceeds to Add to Cart
    Then the cart should have all the options as per selection
    Examples:
      | FABRIC                 | JACKET FIT                  | TROUSERS FIT | TURN UP         | WAISTBAND                      | WAISTCOAT | TROUSERS (ADDITIONAL) | TROUSERS SIZE  | JACKET SIZE |
      | Navy Plain Wool        | Washington- Single Breasted | Brescia      | With Turn Up    | Side Adjusters + Brace Buttons | Capetown  | Skip                  | 42             |  42         |
      | Light Brown Plain Wool | Havana - Single Breasted    | Washington   | Without Turn Up | Belt Loops                     | Skip      | Selected              | 42             |  42         |