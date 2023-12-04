package com.model.observe.subject;

import com.model.observe.observe.Observer;

public interface Subject {
    void resignObserver(Observer ob);

    void removeObserver(Observer ob);

    void notifyObservers();
}
