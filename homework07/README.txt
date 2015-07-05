PART 1
1) Promijenite postojecu implementaciju za promjenu velicine olovke, umjesto
predefinisanih velicina (10, 15, 20) dodajte samo dva dugmeta: + i -,
klikom na dugme +
korisnik poveca velicinu olovke za 5 a klikom na smanji
velicinu olovke za 5.
2) Trenutno crtanje “preskace” ako korisnik vuce misa previse brzo, uradite implementaciju
tako da je linija bez obzira na brzinu crtanja uvijek spojena. HINT tajna je u liniji :)
3) Ako korisnik drzi control (cmd) dugme treba da crtamo koristeci g.drawOval umjesto
onog sto cete implementirati u dijelu 2.
4) Dodajte mogucnost za “undo” undo jednostavno treba da “izbrise” zadnju tacku koju je
korisnik nacrtao.
5) Dodajte podrsku za do 3 “redoa”,
gdje ako je korisnik prethodno izbrisao tacku koristeci
undo ta tacka bude vracena.
6) Dodajte dugme “Text”, kada korisnik klikne na dugme Text otvorite mu JOptionPane u
koji korisnik treba da ukuca tekst koji treba prikazati, zatim otvarate drugi JOptionPane u
koji korisnik unosi string tipa “xx,yy” gdje xx i yy predstavljaju koordinate na koje treba
postaviti uneseni tekst.
Napomena:
Za izradu zadace bice potrebno promijeniti klase Point i PointArray koje smo danas pisali, kao i
klasu PainPanel.


PART 2
1) Zavrsite prethodnu zadacu
2) Zavrsite ColorPicker koji ste poceli raditi na predavanju
3) Spojite ColorPicker sa programom za crtanje
4) Dodajte jos jednu custom komponentu:
Panel koji ce sadrzavati:
4.1) dugme za dodavanje teksta (uradeno kao dio prosle zadace)
4.2) dugme koje ce oznacavati da se crta punom linijom
4.3) dugme koje ce oznacavati da se crta isprekidanom linijom
4.4) dugme za povecavanje i smanjenje debljine linije (uradeno kao dio prosle zadace)
4.5)Dodajte opciju da korisnik moze ubaciti krug i kvadrat na crtez: Klikom na dugme za
krug otvara se JOptionPane u koji korisnik unosi velicinu kruga a sljedecim klikom na
povrsinu za crtanje se taj krug dodaje. (Boja kruga treba da bude trenutna aktivna boja).
Princip je isti za kvadrat.
5) Korisnik treba da zna koja je opcija selektovana (koristeci Border)