/*
 * Created on 2017-09-05 ( Time 14:16:10 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */

package com.nmac.payments.exceptions;

public class NmacPymntsHsNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -1L;

	public NmacPymntsHsNotFoundException(Integer id) {
		super("NmacPymntsHs not found with id: " + id.toString());
	}

	public NmacPymntsHsNotFoundException(String nmacpymntshs) {
		super("NmacPymntsHs " + nmacpymntshs + " not found!");
	}
}
