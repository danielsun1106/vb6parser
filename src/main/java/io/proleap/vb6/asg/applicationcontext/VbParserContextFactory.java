/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.vb6.asg.applicationcontext;

import io.proleap.vb6.asg.inference.impl.TypeAssignmentInferenceImpl;
import io.proleap.vb6.asg.inference.impl.TypeInferenceImpl;
import io.proleap.vb6.asg.registry.api.impl.ApiEnumerationRegistryImpl;
import io.proleap.vb6.asg.registry.api.impl.ApiProcedureRegistryImpl;
import io.proleap.vb6.asg.registry.api.impl.ApiPropertyRegistryImpl;
import io.proleap.vb6.asg.registry.impl.ASGElementRegistryImpl;
import io.proleap.vb6.asg.registry.impl.TypeRegistryImpl;
import io.proleap.vb6.asg.registry.impl.VbTypeNameSanitizerImpl;
import io.proleap.vb6.asg.resolver.impl.NameResolverImpl;
import io.proleap.vb6.asg.resolver.impl.TypeResolverImpl;
import io.proleap.vb6.asg.runner.impl.VbParserRunnerImpl;

public class VbParserContextFactory {

	public static void configureDefaultApplicationContext() {
		VbParserContext.getInstance().reset();

		VbParserContext.getInstance().setApiEnumerationRegistry(new ApiEnumerationRegistryImpl());
		VbParserContext.getInstance().setApiProcedureRegistry(new ApiProcedureRegistryImpl());
		VbParserContext.getInstance().setApiPropertyRegistry(new ApiPropertyRegistryImpl());
		VbParserContext.getInstance().setASGElementRegistry(new ASGElementRegistryImpl());
		VbParserContext.getInstance().setNameResolver(new NameResolverImpl());
		VbParserContext.getInstance().setParserRunner(new VbParserRunnerImpl());
		VbParserContext.getInstance().setTypeAssignmentInference(new TypeAssignmentInferenceImpl());
		VbParserContext.getInstance().setTypeInference(new TypeInferenceImpl());
		VbParserContext.getInstance().setTypeNameSanitizer(new VbTypeNameSanitizerImpl());
		VbParserContext.getInstance().setTypeRegistry(new TypeRegistryImpl());
		VbParserContext.getInstance().setTypeResolver(new TypeResolverImpl());
	}
}