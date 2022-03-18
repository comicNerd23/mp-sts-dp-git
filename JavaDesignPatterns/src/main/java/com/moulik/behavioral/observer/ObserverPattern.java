package com.moulik.behavioral.observer;

/**
 * Observer Pattern defines a 1-N dependency between objects so that when 1 object changes states, all of its dependents are
 * notified and updated automatically.
 * 
 * It has an IObservable which has add(IObserver), remove(IObserver), notify() and getState(), setState() for normal state.
 * There are also Observers which have an update() method.
 * 
 * Usage:
 * 	If you subscribe to a newspaper or magazine, you no longer need to go to the store to check if the next issue is 
 * 	available. Instead, the publisher sends new issues directly to your mailbox right after publication or even in advance.
 * 	In Weatherinfo Scenario
 * 	In RSS Feed
 * 	In LiveScores feed
 *
 */
public class ObserverPattern {

}
