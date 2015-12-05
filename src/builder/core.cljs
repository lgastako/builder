(ns builder.core
  (:require [builder.app :as app]
            [builder.views.main :as main]
            [devcards.core :refer-macros [defcard deftest]]
            [dommy.core :refer-macros [sel1]]
            [its.log :as log]
            [om.core :as om :include-macros true]
            [sablono.core :refer-macros [html]]))

(log/set-level! :debug)
(log/debug ::begin)

(defcard first-card
  (html [:div [:h1 "This is your first devcard!"]]))

(defn main []
  (when-let [node (sel1 :#app)]
    (om/root main/view app/state node)))

(main)

(log/debug ::end)
