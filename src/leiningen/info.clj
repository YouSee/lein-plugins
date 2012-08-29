(ns leiningen.info
  (:use clojure.contrib.pprint))

(defn info [project & args]
  (cond (= (first args) "name") (println (:name project))
	(= (first args) "version") (println (:version project))
	(= (first args) "dependencies") (pprint (:dependencies project))
	(= (first args) "dev-dependencies") (pprint (:dev-dependencies project))	
	(= (first args) "description") (println (:description project))))