TASK #1 – LISTITERATOR
Napisati kod koji napravi jednu listu i popuni je sa dvadeset brojeva od 50 do 100, nasumièno. 
Napraviti drugu listu i zatim toj listi dodati sve elemente prve liste od poèetka do kraja, a zatim dodati 
ponovo sve te elemente, ali od kraja do poèetka, tako da ta nova lista ima duplo više elemenata.

TASK #2 – COUNT LETTERS
Napisati program koji dozvoljava korisniku da kontinualno unosi rijeèi na konzolu. Kada korisnik 
ukuca „end“ onda se program zaustavlja i ispisuje koliko razlièitih slova se pojavilo u rijeèima.

TASK #3 – SORTING
Napisati klasu Country, koja sadrži ime, populaciju i površinu. Ta klasa sadrži jednu metodu koja 
prima listu sa elementima Country, kao i jedan enum set. Taj enum set govori metodi po èemu da 
sortira listu, po imenu, populaciji ili po površini. Set može sadržavati više elemanata (ipak je set u 
pitanju). Ukoliko ima više elemenata onda sortirati prvo po prvom elementu u setu, zatim po drugom, 
pa treæem.

TASK #4 – COUNT WORDS
Napisati kod koji prebroji koliko se svaka rijeè u tekstu pojavljuje. Uzeti bilo koji tekst, staviti ga u 
file i uèitati ga u program. Prebrojane rijeèi i broj repeticija staviti u file poredano po abecedi, a zatim 
u drugi file isto to ispisati ali poredano po broju repeticija.

TASK #5 – PARKING
Napraviti aplikaciju koja pokazuje kada neko uðe i izaðe sa parkinga. Aplikacija sadrži jedan prozor 
u koji se unosi ime N i vrijeme T (u minutama), što znaèi da je osoba N ušla na parking u V minuti a 
izaæi æe u V + T minuti, gdje je V neko proteklo vrijeme. To V teèe u pozadini. Ako V ima vrijednost 10, 
to znaèi da je prošlo 10 minuta. Implementacija V brojaèa se može uraditi u nekom Timer-u. Neka 
timer broji jednu minutu kao jednu sekundu. Ispis stanja parkinga (ko ulazi a ko izlazi) se može pisati 
na konzolu na bilo koji naèin. Koristiti PriorityQueue.
PRIMJER
Minuta 1:
Mujo ulazi na parking i bit æe tu 2 minute
Minuta 2:
Haso ulazi na parking i bit æe tu 1 minutu
Fata ulazi na parking i bit æe tu 2 minute
Minuta 3:
Mujo napušta parking
Haso napušta parking
Minuta 4:
Fata napušta parking