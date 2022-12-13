# send-email

#PT-BR<br>
Primeiro precisa ser gerado uma chave nas configurações do Gmail, seguindo o exemplo:

#ENG-US<br>
Fisrt is necessary generate a key on Gmail configurations, follow the steps.

passo a passo 1:<br>
Step 1:

![send-email-pic](https://user-images.githubusercontent.com/94225931/207365398-725f6ae9-0edf-4fec-815d-bcb3b2e96a98.jpg)

Passo 2:<br>
Step 2:

![send-email-pic1](https://user-images.githubusercontent.com/94225931/207365896-d5c27840-efdb-439b-8f94-ae5fee5b36b3.jpg)

#PT-BR <br>
Insira sua senha e será gerado uma chave para ser usada no arquivo .properties do java resource.<br>
segue o codigo do resource para usar em outro projeto, só descomentar.<br>
subtitua username=*************@gmail.com pelo email que será usado para teste.<br>
E o password substitua pela chave gerada no gmail.<br><br>

#ENG-US<br>
Insert your password and will be generated a key to be used on .properties archive from java resource.<br>
There is the code from resources to be used on another project whenever.<br>
subtitute username=*************@gmail.com to your gmail that will be used to test.<br>
And the password changed to the key generated on gmail configurations.<br><br>

#spring.mail.host=smtp.gmail.com <br>
#spring.mail.port=587 <br>
#spring.mail.username=*************@gmail.com <br>
#spring.mail.password=**************** <br>
#spring.mail.properties.mail.smtp.auth=true <br>
#spring.mail.properties.mail.smtp.starttls.enable=true
<br>

Passo 3:
<br>

Depois de feito essas configurações agora é só rodar a aplicação.<br>
After doing all steps, now play the application.


