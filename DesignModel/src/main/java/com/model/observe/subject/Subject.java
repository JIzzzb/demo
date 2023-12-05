package com.model.observe.subject;

import com.model.observe.observe.Observer;

/**
 * three functions resign new OB,remove Ob
 * notifies all observers when subject`s status change;
 */
public interface Subject {
    void resignObserver(Observer ob);

    void removeObserver(Observer ob);

    void notifyObservers();
}
