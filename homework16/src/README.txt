Potrebno je napraviti Client-Server aplikacije (Client i Server), koje me�usobno komuniciraju.
Komunikacija se odvije putem JSON stringa.
Client �alje upit na Server, a Server na taj upit odgovara sa random re�enicom iz fajla.
Potrebno je u file upisati odre�eni broj re�enica, koje �e Server randomly �itati vra�ati na Client.
Server prvo instancira BitResponse objekat, koji nakon toga pretvara u JSON i vra�a na Client.
Odgovor Servera je u JSON formatu.
Client �ita JSON i pretvara ga u BitResponse objekat.
Specifikacije:
BitRespones objekat se sastoji od:
- message (String)
- timestamp (Date)
JSON izgleda ovako:
{"message": "Va�a poruka","timestamp": "2015-07-31 17:55:00"}
Za ovaj zadatak, potrebno je korisiti Jackson biblioteku.
Biblioteku u .jar obliku, mo�ete preuzeti na:
http://www.java2s.com/Code/JarDownload/jackson-all/jackson-all-1.9.0.jar.zip (otpakovati .zip)
Na�in importovanja te biblioteke u projekat je prikazan na ovom linku:
http://stackoverflow.com/questions/3280353/how-to-import-a-jar-in-eclipse
Primjeri upotrebe Jackson biblioteke:
http://www.technicalkeeda.com/java/convert-java-object-to-json-and-vice-versa-using-jackson
http://java67.blogspot.com/2015/02/how-to-parse-json-tofrom-java-object.html