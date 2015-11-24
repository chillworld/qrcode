#Datahandler components for ZK framework.

[Add this jar to your project](http://stackoverflow.com/questions/20161602/loading-maven-dependencies-from-github) and you can use in zul 

`<qrcodelabel value="@load(...)"/>`
`<qrcode href="@load(...)"/>`

Datahandler can be used on other components :

`<div xmlns:ca="client/attribute" ca:data-qrcode="sclass" sclass="@load(...)"/>`

The cdate-qrcode datahandler takes the field where you reference to the data that must be converted to a qrcode. 
