(ns node.core
	(:require [cljs.core.match :refer-macros [match]]))

(defn main! [] (print "main node core"))
(defn reload! [] (print "reload node core"))

(defn ^:export randomSeq [num] (str (take num (cycle (range 0 1000 1))))) 
(defn ^:export bye [] (str "Bye node core")) 
(defn ^:export hello [] (str "Hello node core")) 
(defn ^:export node-core [] (str "noe-core")) 

(defn ^:export core-match [maxnum] 
	(doseq [n (range 1 maxnum)]
		(println
			(match [(mod n 3) (mod n 5)]
				[0 0] "FizzBuzz"
				[0 _] "Fizz"
				[_ 0] "Buzz"
				:else n))))
	