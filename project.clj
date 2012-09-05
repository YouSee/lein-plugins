(defproject yij/lein-plugins  "1.0.10"
  :description "Lein plugins"
  :dependencies [[org.clojure/clojure "1.4.0"]]

  :profiles {:dev {:dependencies [[lein-clojars "0.9.1"]
                                  [com.stuartsierra/lazytest "1.1.2"]]}}
  
  :dev-dependencies [[lein-clojars "0.6.0"]
                     [com.stuartsierra/lazytest "1.1.2"]]
  :eval-in-leiningen true)
