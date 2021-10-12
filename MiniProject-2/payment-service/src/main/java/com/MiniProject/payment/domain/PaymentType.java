package com.MiniProject.payment.domain;

public enum PaymentType {
    PAYPAL {
        public String toString() {
            return "PAYPAL";
        }
        },

        CC{
            public String toString () {
                return "CC";
            }

        }
    }