(ns leiningen.info
  (:use clojure.contrib.pprint))

(defn info [project & args]
  (cond (= (first args) "name") (prn (:name project))
	(= (first args) "version") (prn (:version project))
	(= (first args) "dependencies") (pprint (:dependencies project))
	(= (first args) "dev-dependencies") (pprint (:dev-dependencies project))	
	(= (first args) "description") (prn (:description project))))