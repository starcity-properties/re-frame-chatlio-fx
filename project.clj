(defproject starcity.re-frame/chatlio-fx "0.1.0"
  :description "Re-frame fx to interface with Chatlio."
  :url "https://github.com/starcity-properties/re-frame-chatlio-fx"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojurescript "1.9.293"]
                 [re-frame "0.9.2"]]

  :plugins [[s3-wagon-private "1.2.0"]]

  :repositories {"releases" {:url        "s3://starjars/releases"
                             :username   :env/aws_access_key
                             :passphrase :env/aws_secret_key}})
