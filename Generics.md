# Generics
1. Vergleiche. Implementieren Sie eine statische generische Methode `diff(s1, s2)`. Der generische Typ soll das `Comparable`-Interface implementieren. Die Methode liefert die folgende Werte:
  - Eine negative Zahl, wenn s1 < s2
  - 0 wenn, s1 == s2
  - Eine positive Zahl, wenn s1 > s2
2. Generics anwenden. In einer früheren Übung haben Sie die Klasse `Stack` für den `int`-Typ geschrieben. Schreiben Sie diese Klasse um, so dass Sie für beliebige Typen verwendbar ist. Verwenden Sie nun eine List statt einem Array zum Speichern der Elemente im innern des Stacks.
3. Datenstrukturen und Generics. Definieren Sie ein eigenes Interface `Set` und schreiben Sie eine Klasse `SetImpl`, welches dieses Interface implementiert. Das Interface enthält drei Methoden: `boolean add(T element)`, `boolean contains(T element)` und `List<T> elements()` (hier gibt es keine definierte Ordnung, aber die Liste soll nicht modifizierbar sein). Verwenden Sie zur Implementation der Klasse `SetImpl` die Datenstruktur `List`.
4. Generische Methoden. Schreiben Sie eine generische Methode `max(a)`, welche das grösste Element der Liste `a` zurückgibt. Die Elemente können von beliebigem Typ sein, müssen aber das Interface `Comparable<T>` implementiert haben.
5. Eine generische Klasse `GenericTyp1<Q>` definiert ein privates Attribut `objekt` vom Typ des Typparameters `Q`. Die Klasse soll nur über den parameterlosen Standard-Konstruktor verfügen und zur Aufnahme und Bereitstellung von Objekten die Methoden `setObjekt()` und `getObjekt()` definieren. Bilden Sie z.B. Instanzen der Klasse vom Typ `Integer` und `String` und zeigen Sie, dass eine Instanz der Klasse vom Typ Integer nur Objekte vom Typ Integer aufnehmen kann. Das Gleiche gilt für Instanzen vom Typ String.
6. Definieren Sie analog zur obigen Aufgabe eine generische Klasse `GenericTyp2<S>`, deren Konstruktor eine Referenz auf ein Objekt vom Typ des Typparameters `S` übergeben bekommt. Damit wird die Methode `setObjekt()` zur Aufnahme von Objekten nicht mehr benötigt. Sorgen Sie dafür, dass nur Objekte, welche das Interface `java.io.Serializable` implementieren in der Klasse `GenericTyp2` gespeichert werden können. Schreiben Sie zum Testen eine eigene Klasse, welche das `Serializable` Interface implementiert.
7. Schreiben Sie eine generische Methode, welche Varargs vom Typ `A` als Parameter nimmt, und ein `Set<A>` zurückgibt. Ist ein Element in der Parameterliste mehrfach enthalten, so soll eine `IllegalArgumentException` geworfen werden. Es kommt also nur ein Set zurück, wenn es in der Parameterliste keine Duplikate gibt. 
8. Implement a function that computes the union of two lists. Take the Test class from the `solution` folder and work yourself through it test by test. 
The test class assumes a class structure as follows:
 - `ChocolateCake` extends `Cake`
 - `StuffedChocolateCake` extends `ChocolateCake`
 - `VanillaCake` extends `Cake`
