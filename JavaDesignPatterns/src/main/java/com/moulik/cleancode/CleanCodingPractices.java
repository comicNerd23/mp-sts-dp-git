package com.moulik.cleancode;

/**
 * Beim Code Reviews soll man daran denken/darauf achten, dass er praktiken folgt:
 * Practices (Verfahren/Praktiken):
 * 1. Bedeutsame Namen: 
 * 		Verwenden Sie sinnvoll, absichtsvolle, aussprechbare Namen.
 * 		theList, accountList, CstmrRcrd,
 *		gameBoard, accounts/accountGroup, Customer
 * 		Variablen mit größerem Scope (Geltungsbereich) erfordern längere Namen. z.b WORK_DAYS_PER_WEEK
 * 		Methodennamen sollten Verben sein. e.g postPayment(), deletePage(), save()
 * 		Klassennamen sollten Substantive sein, keine Verben. e.g Customer, WikiPage, Account  Manager, Processor, Data, Info
 * 		Befolgen Sie die CamelCase-Namenskonventionen z.b falsch: elapsedtimedays, korrekt: elapsedTimeInDays
 * 		Ersetzen Sie magische Zahlen durch benannte Konstanten. z.b 86400 SECONDS_PER_DAY 55 LINES_PER_PAGE
 * 
 * 2. Methoden: 
 * 		i. Methoden sollten klein sein und genau eine Sache tun
 * 		ii. Alle Anweisungen in einer Methode müssen sich auf einer einzigen Abstraktionsebene befinden. Z.B. getHtml(); 
 * 		String pagePathName = PathParser.render(pagePath); .append("\n"); befinden sich alle auf unterschiedlichen 
 * 		Abstraktionsebenen.
 * 		iii. Code von oben nach unten lesen: Die Stepdown-Regel. Der Code sollte wie eine Top-Down-Erzählung gelesen werden.
 * 		iv. Eine Methode sollte nicht mehr als drei Argumente haben.
 * 		v. Übergeben Sie niemals ein (boolesches) Flag-Argument an eine Funktion. Das bedeutet, dass die Methode mehr als 
 * 		eine Sache tut. 
 * 
 * 3. Kommentaren: 
 * 		i. Erklären Sie sich im Code, anstatt Kommentare zu schreiben.
 * 		ii. Scannen Sie und eliminieren Sie TODOs regelmäßig in deinem Code.
 * 		iii. Vermeiden Sie es, lange und überflüssige Kommentare zu schreiben.
 * 		iv. Code nicht auskommentieren, sondern einfach entfernen. Es kann bei Bedarf immer von der Versionskontrolle 
 * 		abgerufen werden.
 * 		v. Vermeiden Sie Javadocs in nicht-öffentlichen APIs.

 * 4. Formatting and indentations: Der Code soll gut formatiert sein, Es sollte den gleichen Praktiken folgen, die im 
 * Projekt befolgt werden
 * 		i. Konzepte, die eng miteinander verwandt sind, sollten vertikal nahe beieinander gehalten werden
 * 		ii. Trennen Sie Konzepte vertikal mit Leerzeilen. Code sollte wie bei Zeitung ausgerichtet und formuliert sein.
 * 		iii. Im Allgemeinen möchten wir, dass Abhängigkeiten von Funktionsaufrufen nach unten zeigen. Das heißt, eine 
 * 		aufgerufene Funktion sollte unter einer aufrufenden Funktion liegen. Dies erzeugt einen schönen Ablauf des 
 * 		Quellcodemoduls von der hohen Ebene zur niedrigen Ebene.
 *  
 * 5. Unit Tests: 
 * 		i. Schreiben Sie zuerst Unittests, bevor wir Produktionscode schreiben
 * 		ii. Lesbarkeit ist in Unit-Tests sogar noch wichtiger als im Produktionscode.
 * 		iii. Die Anzahl der Asserts in einem Test sollte minimiert werden. Testen Sie in jeder Testfunktion ein einzelnes 
 * 		Konzept.
 * 		iv. Saubere Tests sollten F.I.R.S.T. Konventionen folgen
 *
 * 6. Error Handling
 * 		i. Geben Sie Kontext mit Exceptions an. z.b Geben Sie die fehlgeschlagene Operation und die Art des Fehlers an.
 * 		ii. Verwenden Sie Exception anstelle von Rückgabecodes
 * 		iii. Verwenden Sie unchecked Exception gegenüber checked Exception.
 * 		iv. Wenn das Schlüsselwort try in einer Funktion vorhanden ist, sollte es das allererste Wort in der Funktion sein 
 * 		und nach den catch/finally-Blöcken sollte nichts mehr stehen.
 *  
 * 7. Classes
 * 		i. Die Klassen sollten klein sein. Sie sollten dem Single-Responsibility-Prinzip folgen und nur einen Grund haben, 
 * 		sich zu ändern.
 * 		ii. 
 */
public class CleanCodingPractices {

}
