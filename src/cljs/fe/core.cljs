(ns fe.core
	(:require [cljs.core.match :refer-macros [match]]))

(defn ^:export sayHello [] 
	(js/alert "안뇽"))

(defn ^:export say [msg] 
	(js/alert msg))

(defn init []
	(println "fn core!"))

; core match
(defn ^:export core-match [maxnum] 
	(doseq [n (range 1 maxnum)]
		(match [(mod n 3) (mod n 5)]
			[0 0] (js/alert (str n " => " "FizzBuzz"))
			[0 _] "Fizz"
			[_ 0] "Buzz"
			:else n)))
	