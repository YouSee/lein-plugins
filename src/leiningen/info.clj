(ns leiningen.info
  (:use clojure.pprint))

(defn info [project & args]
  (cond (= (first args) "name") (println (:name project))
	(= (first args) "version") (println (:version project))
	(= (first args) "dependencies") (pprint (:dependencies project))	
	(= (first args) "description") (println (:description project))))