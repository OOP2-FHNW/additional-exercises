# Basiswissen OOP1
1. Array invertieren. Schreiben Sie eine Methode `invert(a)`, die die Reihenfolge der Elemente eines Arrays `a` umkehrt.
2. Iterator-Form der for-Anweisung (enhanced for loop). Schreiben Sie eine Methode `int negativeValues(int[] a) {...}`
die die Iterator-Form der for-Anweisung benutzt, um die Anzahl der negativen Elemente im Array a zu berechnen und als Funktionswert zurückzugeben.
3. Schreiben Sie eine Methode `int sum(int[][] a) {...}`, welche die Iterator-Form der for-Anweisung benutzt, um die Elemente des zweidimensionalen Arrays `a` aufzuaddieren und als Funktionswert zurückzugeben.
4. Domainnamen spiegeln. Schreiben Sie eine Methode `domain(adr)`, die eine E-Mail-Adresse `adr` als Parameter bekommt und den darin vorkommenden Domainnamen in seine Bestandteile zerlegt, in umgekehrter Reihenfolge wieder zusammensetzt und als String zurückgibt. Die Adresse `"hermann.maier@students.uni-linz.ac.at"` soll zum Ergebnis `"at.ac.uni-linz.students"` führen.
5. Namen umformatieren. Schreiben Sie ein Programm, das eine Liste von Namen (erster Vorname, zweiter Vorname, Nachname) laut folgenden Beispielen umformatiert: 
  - `Martin Rolf Ammerbacher` => `Ammerbacher, Martin R.`
  - `Roman Andreas Weizenhuber` => `Weizenhuber, Roman A.`
6. Ausgaberoutine mit variabler Anzahl von Parametern. Schreiben Sie eine Methode `static void print (String s, int[] val) {...}`, die den String `s` am Bildschirm ausgibt, vorher aber alle Vorkommen von `"$i"` in `s` durch `val[i]` ersetzt (`"$0"` soll z.B. durch `val[0]` ersetzt werden). Ist `i` größer als `val.length-1`, soll `"$i"` durch den leeren String ersetzt werden.
7. Vererbung. Schreiben Sie eine Klassenhierarchie für verschiedene Fahrzeuge (Fahrrad, Moped, Motorrad, PKW, LKW, ...). Überlegen Sie sich sinnvolle Attribute und Methoden. Welche Klassen sind abstrakt und welche konret?
8. Enumerationstypen, Unfallstatistik. Implementieren Sie einen Enumerationstyp für Wochentage sowie eine Klasse zur Verwaltung einer Unfallstatistik der laufenden Woche. Es soll eine Methode geben, um die Anzahl der Unfälle für einen bestimmten Wochentag zu inkrementieren, sowie eine Methode, um die Anzahl der Unfälle an einem bestimmten Wochentag abzufragen. Schreiben Sie wie immer JUnit-Tests.
9. Enumerationstypen, Arithmetische Operationen. Implementieren Sie eine Methode `int compute(int x, Operator op, int y) {...}`, die zwei Zahlen `x` und `y` gemäß der Operation `op` verknüpft und das Ergebnis liefert. `Operator` soll ein Enumerationstyp sein und die vier arithmetischen Operatoren (`+`, `-`, `*` und `/`) darstellen.