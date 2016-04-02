(defproject com.billpiel.sayid "0.0.1"
  :description "Sayid is a library for debugging and profiling clojure code."
  :url "http://bpiel.github.io/sayid/"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [mvxcvi/puget "0.8.1"]
                 [org.clojure/tools.reader "1.0.0-alpha3"]]
  :profiles {:dev {:dependencies [[midje "1.8.3"]]
                   :plugins [[lein-midje "3.1.3"]
                             [lein-codox "0.9.4"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.0"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}}
  :codox {:namespaces [com.billpiel.sayid.core]}
  :aliases {"test-all" ["with-profile" "+1.4:+1.5:+1.6:+1.7:+1.8" "midje"]})
