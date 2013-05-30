(ns clj-gae.test.core
  (:use [clj-gae.core]
        [midje.sweet]))

(fact (+ 1 1) => 2)
