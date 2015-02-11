# XPagesEmailValidatorPlugin
An Email Validator for XPages

This is an example plugin from a blog post over at gregorbyte.com

http://www.gregorbyte.com/2015/02/email-address-validator-for-xpages.html


To Install to Domino Designer
------------------------------

Download version 1.0.0 from the Releases section to somewhere on you computer

In domino design

Go to File -> Application -> Install
Search  for new features
add a folder location and choose the com.gregorbyte.xsp.emailvalidator.updatesite folder
Select the feature, install and restart

Don't forget to update the xsp.properties for each nsf that will use it, go to page generation and tick the 'com.gregorbyte.xsp.emailvalidation.library'
