
Feature: Shop-Add to Basket-View Basket Functionality						

  @AddCart
  Scenario: View Basket Functionality
    Given Open automationtesting page for View Basket
    When Click on Shop Menu for View Basket
    Then Click on the Add To Basket button 
Then User can view that Book in the Menu item with price
Then Click on View Basket link to proceed to check out page
Then User can find total and subtotal values just above the Proceed to Checkout button
Then Total always < subtotal as taxes are added in the subtotal
Then Click on Proceed to Check out button to payment gateway page
Then User can view Billing Details,Order Details,Additional details and Payment gateway details
Then User can fill billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal
Then Click on Place Order button to complete process
Then Onclick of place order button user completes his process where the page navigates to Order confirmation page with order details,bank details,customer details and billing details.