TASK #1 � LISTITERATOR
Napisati kod koji napravi jednu listu i popuni je sa dvadeset brojeva od 50 do 100, nasumi�no. 
Napraviti drugu listu i zatim toj listi dodati sve elemente prve liste od po�etka do kraja, a zatim dodati 
ponovo sve te elemente, ali od kraja do po�etka, tako da ta nova lista ima duplo vi�e elemenata.

TASK #2 � COUNT LETTERS
Napisati program koji dozvoljava korisniku da kontinualno unosi rije�i na konzolu. Kada korisnik 
ukuca �end� onda se program zaustavlja i ispisuje koliko razli�itih slova se pojavilo u rije�ima.

TASK #3 � SORTING
Napisati klasu Country, koja sadr�i ime, populaciju i povr�inu. Ta klasa sadr�i jednu metodu koja 
prima listu sa elementima Country, kao i jedan enum set. Taj enum set govori metodi po �emu da 
sortira listu, po imenu, populaciji ili po povr�ini. Set mo�e sadr�avati vi�e elemanata (ipak je set u 
pitanju). Ukoliko ima vi�e elemenata onda sortirati prvo po prvom elementu u setu, zatim po drugom, 
pa tre�em.

TASK #4 � COUNT WORDS
Napisati kod koji prebroji koliko se svaka rije� u tekstu pojavljuje. Uzeti bilo koji tekst, staviti ga u 
file i u�itati ga u program. Prebrojane rije�i i broj repeticija staviti u file poredano po abecedi, a zatim 
u drugi file isto to ispisati ali poredano po broju repeticija.

TASK #5 � PARKING
Napraviti aplikaciju koja pokazuje kada neko u�e i iza�e sa parkinga. Aplikacija sadr�i jedan prozor 
u koji se unosi ime N i vrijeme T (u minutama), �to zna�i da je osoba N u�la na parking u V minuti a 
iza�i �e u V + T minuti, gdje je V neko proteklo vrijeme. To V te�e u pozadini. Ako V ima vrijednost 10, 
to zna�i da je pro�lo 10 minuta. Implementacija V broja�a se mo�e uraditi u nekom Timer-u. Neka 
timer broji jednu minutu kao jednu sekundu. Ispis stanja parkinga (ko ulazi a ko izlazi) se mo�e pisati 
na konzolu na bilo koji na�in. Koristiti PriorityQueue.
PRIMJER
Minuta 1:
Mujo ulazi na parking i bit �e tu 2 minute
Minuta 2:
Haso ulazi na parking i bit �e tu 1 minutu
Fata ulazi na parking i bit �e tu 2 minute
Minuta 3:
Mujo napu�ta parking
Haso napu�ta parking
Minuta 4:
Fata napu�ta parking