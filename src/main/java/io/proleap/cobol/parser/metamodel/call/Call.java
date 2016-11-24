/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.parser.metamodel.call;

import io.proleap.cobol.parser.metamodel.CobolDivisionElement;
import io.proleap.cobol.parser.metamodel.NamedElement;

public interface Call extends CobolDivisionElement, NamedElement {

	public enum CallType {
		CommunicationDescriptionEntryCall, DataDescriptionEntryCall, ProcedureCall, ReportDescriptionEntryCall, UndefinedCall, VariableCall;
	}

	CallType getCallType();

	Call unwrap();
}
