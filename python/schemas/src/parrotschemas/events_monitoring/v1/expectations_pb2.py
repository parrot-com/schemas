# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: parrotschemas/events_monitoring/v1/expectations.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='parrotschemas/events_monitoring/v1/expectations.proto',
  package='parrotschemas.events_monitoring.v1',
  syntax='proto3',
  serialized_options=b'\n!com.parrothq.events_monitoring.v1P\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n5parrotschemas/events_monitoring/v1/expectations.proto\x12\"parrotschemas.events_monitoring.v1\"\xea\x01\n\x1dRecordingPreprocessingStarted\x12\x43\n\x06source\x18\x01 \x01(\x0e\x32\x33.parrotschemas.events_monitoring.v1.RecordingSource\x12?\n\x04type\x18\x02 \x01(\x0e\x32\x31.parrotschemas.events_monitoring.v1.RecordingType\x12\x11\n\thas_video\x18\x03 \x01(\x08\x12\x14\n\x0chas_exhibits\x18\x04 \x01(\x08\x12\x1a\n\x12has_unwanted_parts\x18\x05 \x01(\x08\"\x1b\n\x19TranscodingAudioCompleted\"\x1b\n\x19TranscodingVideoCompleted\"\x1e\n\x1cRemoveUnwantedAudioCompleted\"\x1e\n\x1cRemoveUnwantedVideoCompleted\" \n\x1e\x42lackOutUnwantedVideoCompleted\"\x1a\n\x18\x43omputeWaveformCompleted\"\x1a\n\x18ProcessExhibitsCompleted\"!\n\x1fRecordingPreprocessingCompleted\"1\n\x11RoughDraftStarted\x12\x1c\n\x14\x61udio_length_seconds\x18\x01 \x01(\x05\"\x1c\n\x1aGenerateDocumentsCompleted\"%\n\x13RoughDraftCompleted\x12\x0e\n\x06status\x18\x01 \x01(\t*F\n\x0fRecordingSource\x12\x1c\n\x18RECORDING_SOURCE_UNKNOWN\x10\x00\x12\n\n\x06UPLOAD\x10\x01\x12\t\n\x05\x45VENT\x10\x02*F\n\rRecordingType\x12\x1a\n\x16RECORDING_TYPE_UNKNOWN\x10\x00\x12\r\n\tRESERVOIR\x10\x01\x12\n\n\x06\x43LIENT\x10\x02\x42%\n!com.parrothq.events_monitoring.v1P\x01\x62\x06proto3'
)

_RECORDINGSOURCE = _descriptor.EnumDescriptor(
  name='RecordingSource',
  full_name='parrotschemas.events_monitoring.v1.RecordingSource',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='RECORDING_SOURCE_UNKNOWN', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UPLOAD', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='EVENT', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=697,
  serialized_end=767,
)
_sym_db.RegisterEnumDescriptor(_RECORDINGSOURCE)

RecordingSource = enum_type_wrapper.EnumTypeWrapper(_RECORDINGSOURCE)
_RECORDINGTYPE = _descriptor.EnumDescriptor(
  name='RecordingType',
  full_name='parrotschemas.events_monitoring.v1.RecordingType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='RECORDING_TYPE_UNKNOWN', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RESERVOIR', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CLIENT', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=769,
  serialized_end=839,
)
_sym_db.RegisterEnumDescriptor(_RECORDINGTYPE)

RecordingType = enum_type_wrapper.EnumTypeWrapper(_RECORDINGTYPE)
RECORDING_SOURCE_UNKNOWN = 0
UPLOAD = 1
EVENT = 2
RECORDING_TYPE_UNKNOWN = 0
RESERVOIR = 1
CLIENT = 2



_RECORDINGPREPROCESSINGSTARTED = _descriptor.Descriptor(
  name='RecordingPreprocessingStarted',
  full_name='parrotschemas.events_monitoring.v1.RecordingPreprocessingStarted',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='source', full_name='parrotschemas.events_monitoring.v1.RecordingPreprocessingStarted.source', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='parrotschemas.events_monitoring.v1.RecordingPreprocessingStarted.type', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='has_video', full_name='parrotschemas.events_monitoring.v1.RecordingPreprocessingStarted.has_video', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='has_exhibits', full_name='parrotschemas.events_monitoring.v1.RecordingPreprocessingStarted.has_exhibits', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='has_unwanted_parts', full_name='parrotschemas.events_monitoring.v1.RecordingPreprocessingStarted.has_unwanted_parts', index=4,
      number=5, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=94,
  serialized_end=328,
)


_TRANSCODINGAUDIOCOMPLETED = _descriptor.Descriptor(
  name='TranscodingAudioCompleted',
  full_name='parrotschemas.events_monitoring.v1.TranscodingAudioCompleted',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=330,
  serialized_end=357,
)


_TRANSCODINGVIDEOCOMPLETED = _descriptor.Descriptor(
  name='TranscodingVideoCompleted',
  full_name='parrotschemas.events_monitoring.v1.TranscodingVideoCompleted',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=359,
  serialized_end=386,
)


_REMOVEUNWANTEDAUDIOCOMPLETED = _descriptor.Descriptor(
  name='RemoveUnwantedAudioCompleted',
  full_name='parrotschemas.events_monitoring.v1.RemoveUnwantedAudioCompleted',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=388,
  serialized_end=418,
)


_REMOVEUNWANTEDVIDEOCOMPLETED = _descriptor.Descriptor(
  name='RemoveUnwantedVideoCompleted',
  full_name='parrotschemas.events_monitoring.v1.RemoveUnwantedVideoCompleted',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=420,
  serialized_end=450,
)


_BLACKOUTUNWANTEDVIDEOCOMPLETED = _descriptor.Descriptor(
  name='BlackOutUnwantedVideoCompleted',
  full_name='parrotschemas.events_monitoring.v1.BlackOutUnwantedVideoCompleted',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=452,
  serialized_end=484,
)


_COMPUTEWAVEFORMCOMPLETED = _descriptor.Descriptor(
  name='ComputeWaveformCompleted',
  full_name='parrotschemas.events_monitoring.v1.ComputeWaveformCompleted',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=486,
  serialized_end=512,
)


_PROCESSEXHIBITSCOMPLETED = _descriptor.Descriptor(
  name='ProcessExhibitsCompleted',
  full_name='parrotschemas.events_monitoring.v1.ProcessExhibitsCompleted',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=514,
  serialized_end=540,
)


_RECORDINGPREPROCESSINGCOMPLETED = _descriptor.Descriptor(
  name='RecordingPreprocessingCompleted',
  full_name='parrotschemas.events_monitoring.v1.RecordingPreprocessingCompleted',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=542,
  serialized_end=575,
)


_ROUGHDRAFTSTARTED = _descriptor.Descriptor(
  name='RoughDraftStarted',
  full_name='parrotschemas.events_monitoring.v1.RoughDraftStarted',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='audio_length_seconds', full_name='parrotschemas.events_monitoring.v1.RoughDraftStarted.audio_length_seconds', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=577,
  serialized_end=626,
)


_GENERATEDOCUMENTSCOMPLETED = _descriptor.Descriptor(
  name='GenerateDocumentsCompleted',
  full_name='parrotschemas.events_monitoring.v1.GenerateDocumentsCompleted',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=628,
  serialized_end=656,
)


_ROUGHDRAFTCOMPLETED = _descriptor.Descriptor(
  name='RoughDraftCompleted',
  full_name='parrotschemas.events_monitoring.v1.RoughDraftCompleted',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='status', full_name='parrotschemas.events_monitoring.v1.RoughDraftCompleted.status', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=658,
  serialized_end=695,
)

_RECORDINGPREPROCESSINGSTARTED.fields_by_name['source'].enum_type = _RECORDINGSOURCE
_RECORDINGPREPROCESSINGSTARTED.fields_by_name['type'].enum_type = _RECORDINGTYPE
DESCRIPTOR.message_types_by_name['RecordingPreprocessingStarted'] = _RECORDINGPREPROCESSINGSTARTED
DESCRIPTOR.message_types_by_name['TranscodingAudioCompleted'] = _TRANSCODINGAUDIOCOMPLETED
DESCRIPTOR.message_types_by_name['TranscodingVideoCompleted'] = _TRANSCODINGVIDEOCOMPLETED
DESCRIPTOR.message_types_by_name['RemoveUnwantedAudioCompleted'] = _REMOVEUNWANTEDAUDIOCOMPLETED
DESCRIPTOR.message_types_by_name['RemoveUnwantedVideoCompleted'] = _REMOVEUNWANTEDVIDEOCOMPLETED
DESCRIPTOR.message_types_by_name['BlackOutUnwantedVideoCompleted'] = _BLACKOUTUNWANTEDVIDEOCOMPLETED
DESCRIPTOR.message_types_by_name['ComputeWaveformCompleted'] = _COMPUTEWAVEFORMCOMPLETED
DESCRIPTOR.message_types_by_name['ProcessExhibitsCompleted'] = _PROCESSEXHIBITSCOMPLETED
DESCRIPTOR.message_types_by_name['RecordingPreprocessingCompleted'] = _RECORDINGPREPROCESSINGCOMPLETED
DESCRIPTOR.message_types_by_name['RoughDraftStarted'] = _ROUGHDRAFTSTARTED
DESCRIPTOR.message_types_by_name['GenerateDocumentsCompleted'] = _GENERATEDOCUMENTSCOMPLETED
DESCRIPTOR.message_types_by_name['RoughDraftCompleted'] = _ROUGHDRAFTCOMPLETED
DESCRIPTOR.enum_types_by_name['RecordingSource'] = _RECORDINGSOURCE
DESCRIPTOR.enum_types_by_name['RecordingType'] = _RECORDINGTYPE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

RecordingPreprocessingStarted = _reflection.GeneratedProtocolMessageType('RecordingPreprocessingStarted', (_message.Message,), {
  'DESCRIPTOR' : _RECORDINGPREPROCESSINGSTARTED,
  '__module__' : 'parrotschemas.events_monitoring.v1.expectations_pb2'
  # @@protoc_insertion_point(class_scope:parrotschemas.events_monitoring.v1.RecordingPreprocessingStarted)
  })
_sym_db.RegisterMessage(RecordingPreprocessingStarted)

TranscodingAudioCompleted = _reflection.GeneratedProtocolMessageType('TranscodingAudioCompleted', (_message.Message,), {
  'DESCRIPTOR' : _TRANSCODINGAUDIOCOMPLETED,
  '__module__' : 'parrotschemas.events_monitoring.v1.expectations_pb2'
  # @@protoc_insertion_point(class_scope:parrotschemas.events_monitoring.v1.TranscodingAudioCompleted)
  })
_sym_db.RegisterMessage(TranscodingAudioCompleted)

TranscodingVideoCompleted = _reflection.GeneratedProtocolMessageType('TranscodingVideoCompleted', (_message.Message,), {
  'DESCRIPTOR' : _TRANSCODINGVIDEOCOMPLETED,
  '__module__' : 'parrotschemas.events_monitoring.v1.expectations_pb2'
  # @@protoc_insertion_point(class_scope:parrotschemas.events_monitoring.v1.TranscodingVideoCompleted)
  })
_sym_db.RegisterMessage(TranscodingVideoCompleted)

RemoveUnwantedAudioCompleted = _reflection.GeneratedProtocolMessageType('RemoveUnwantedAudioCompleted', (_message.Message,), {
  'DESCRIPTOR' : _REMOVEUNWANTEDAUDIOCOMPLETED,
  '__module__' : 'parrotschemas.events_monitoring.v1.expectations_pb2'
  # @@protoc_insertion_point(class_scope:parrotschemas.events_monitoring.v1.RemoveUnwantedAudioCompleted)
  })
_sym_db.RegisterMessage(RemoveUnwantedAudioCompleted)

RemoveUnwantedVideoCompleted = _reflection.GeneratedProtocolMessageType('RemoveUnwantedVideoCompleted', (_message.Message,), {
  'DESCRIPTOR' : _REMOVEUNWANTEDVIDEOCOMPLETED,
  '__module__' : 'parrotschemas.events_monitoring.v1.expectations_pb2'
  # @@protoc_insertion_point(class_scope:parrotschemas.events_monitoring.v1.RemoveUnwantedVideoCompleted)
  })
_sym_db.RegisterMessage(RemoveUnwantedVideoCompleted)

BlackOutUnwantedVideoCompleted = _reflection.GeneratedProtocolMessageType('BlackOutUnwantedVideoCompleted', (_message.Message,), {
  'DESCRIPTOR' : _BLACKOUTUNWANTEDVIDEOCOMPLETED,
  '__module__' : 'parrotschemas.events_monitoring.v1.expectations_pb2'
  # @@protoc_insertion_point(class_scope:parrotschemas.events_monitoring.v1.BlackOutUnwantedVideoCompleted)
  })
_sym_db.RegisterMessage(BlackOutUnwantedVideoCompleted)

ComputeWaveformCompleted = _reflection.GeneratedProtocolMessageType('ComputeWaveformCompleted', (_message.Message,), {
  'DESCRIPTOR' : _COMPUTEWAVEFORMCOMPLETED,
  '__module__' : 'parrotschemas.events_monitoring.v1.expectations_pb2'
  # @@protoc_insertion_point(class_scope:parrotschemas.events_monitoring.v1.ComputeWaveformCompleted)
  })
_sym_db.RegisterMessage(ComputeWaveformCompleted)

ProcessExhibitsCompleted = _reflection.GeneratedProtocolMessageType('ProcessExhibitsCompleted', (_message.Message,), {
  'DESCRIPTOR' : _PROCESSEXHIBITSCOMPLETED,
  '__module__' : 'parrotschemas.events_monitoring.v1.expectations_pb2'
  # @@protoc_insertion_point(class_scope:parrotschemas.events_monitoring.v1.ProcessExhibitsCompleted)
  })
_sym_db.RegisterMessage(ProcessExhibitsCompleted)

RecordingPreprocessingCompleted = _reflection.GeneratedProtocolMessageType('RecordingPreprocessingCompleted', (_message.Message,), {
  'DESCRIPTOR' : _RECORDINGPREPROCESSINGCOMPLETED,
  '__module__' : 'parrotschemas.events_monitoring.v1.expectations_pb2'
  # @@protoc_insertion_point(class_scope:parrotschemas.events_monitoring.v1.RecordingPreprocessingCompleted)
  })
_sym_db.RegisterMessage(RecordingPreprocessingCompleted)

RoughDraftStarted = _reflection.GeneratedProtocolMessageType('RoughDraftStarted', (_message.Message,), {
  'DESCRIPTOR' : _ROUGHDRAFTSTARTED,
  '__module__' : 'parrotschemas.events_monitoring.v1.expectations_pb2'
  # @@protoc_insertion_point(class_scope:parrotschemas.events_monitoring.v1.RoughDraftStarted)
  })
_sym_db.RegisterMessage(RoughDraftStarted)

GenerateDocumentsCompleted = _reflection.GeneratedProtocolMessageType('GenerateDocumentsCompleted', (_message.Message,), {
  'DESCRIPTOR' : _GENERATEDOCUMENTSCOMPLETED,
  '__module__' : 'parrotschemas.events_monitoring.v1.expectations_pb2'
  # @@protoc_insertion_point(class_scope:parrotschemas.events_monitoring.v1.GenerateDocumentsCompleted)
  })
_sym_db.RegisterMessage(GenerateDocumentsCompleted)

RoughDraftCompleted = _reflection.GeneratedProtocolMessageType('RoughDraftCompleted', (_message.Message,), {
  'DESCRIPTOR' : _ROUGHDRAFTCOMPLETED,
  '__module__' : 'parrotschemas.events_monitoring.v1.expectations_pb2'
  # @@protoc_insertion_point(class_scope:parrotschemas.events_monitoring.v1.RoughDraftCompleted)
  })
_sym_db.RegisterMessage(RoughDraftCompleted)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
