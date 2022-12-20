Feature: ComputersPage

  Scenario: User Should verify Product Added To Shopping Cart Successfully
    Given I am on homepage
    When I click on Computer
    And I click on Desktopmenu
    And I select Sort By position "Name:A to Z"
    And I click on "Add To Cart"
    And I verify the Text "Build your own computer"
    And I select "2.2 GHz Intel Pentium Dual-Core E2200"
    And I select "8GB[+$60.00]"
    And I select HDD radio "400 GB[+100.00]"
    And I select OS radio "Vista Premium[+$60.00]"
    And I Check Two Check boxes "Microsoft Office[+$50.00]" and "Total Commander[+$5.00]"
    And I verify the price"$1,475.00"
    And I click on "Add To Card" Button
    And I verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar
    And I click on the cross button
    And I MouseHover on "Shopping cart"
    And I click on "GO TO CART" button
    And I verify the message "Shopping Cart"
    And I change the Qty to "2"
    And I click on "Update shopping cart"
    And I verify the Total "$2,950.00"
    And I click on Checkbox "I agree with the terms of service"
    And I click on "Checkout"
    And I verify the text "Welcome,Please Sign In!"
    And I click on "Checkout As Guest" Tab
    And I fill the all mandatory field
    And I click on "Continue"
    And I click on Radio Button "Next DAy Air($0.00)"
    And I click on "Continue"
    And I select Radio Button "Credit Card"
    And I select "Master Card" From select credit card dropdown
    And I fill all the details
    And I click on "Continue"
    And I verify "Payment Method"is "Credit Card"
    And I verify "Shipping Method" is "Next Day Air"
    And I verify Total is "$2,950.00"
    And I click on "Confirm"
    And I verify the Text "Thank You"
    And I verify the message "Your order has been successfully processed!"
    And I click on "Continue"
    Then I verify the text "Welcome to our sotre"
